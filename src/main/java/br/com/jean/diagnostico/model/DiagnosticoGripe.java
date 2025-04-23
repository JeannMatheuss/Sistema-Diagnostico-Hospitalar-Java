package br.com.jean.diagnostico.model;

import br.com.jean.diagnostico.base.Diagnostico;

import java.util.Arrays;

public class DiagnosticoGripe extends Diagnostico {

    public DiagnosticoGripe() {
        super(new String[]{"febre", "tosse", "dor de cabeça", "cansaço"});
    }

    @Override
    public String avaliarPaciente(String[] sintomasInformados) {
        int contador = 0;
        for (String sintoma : sintomasInformados) {
            if (Arrays.asList(sintomasComuns).contains(sintoma)) {
                contador++;
            }
        }
        return (contador >= 2) ? "Provável Gripe. Repouso e hidratação recomendados."
                : "Poucos sintomas compatíveis com Gripe.";
    }
}
