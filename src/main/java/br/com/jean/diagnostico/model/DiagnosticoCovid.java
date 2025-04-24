package br.com.jean.diagnostico.model;

import br.com.jean.diagnostico.base.Diagnostico;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DiagnosticoCovid extends Diagnostico {

    public DiagnosticoCovid() {
        // Certificando que todos os sintomas estão em minúsculas
        super(new String[]{"febre", "tosse seca", "perda de olfato", "dificuldade para respirar"});
    }

    @Override
    public String avaliarPaciente(String[] sintomasInformados) {
        List<String> sintomasList = Arrays.stream(sintomasComuns)
                .map(String::toLowerCase)  // Garantindo que todos os sintomas estejam em minúsculas
                .collect(Collectors.toList());
        int contador = 0;

        for (String sintoma : sintomasInformados) {
            if (sintomasList.contains(sintoma.toLowerCase())) {
                contador++;
            }
        }

        return (contador >= 2) ? "Provável Covid. Procure orientação médica e mantenha isolamento."
                : "Poucos sintomas compatíveis com Covid.";
    }
}
