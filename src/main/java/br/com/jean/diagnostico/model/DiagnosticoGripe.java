package br.com.jean.diagnostico.model;

import br.com.jean.diagnostico.base.Diagnostico;

public class DiagnosticoGripe extends Diagnostico {
    public DiagnosticoGripe(String[] sintomasComuns) {
        super(sintomasComuns);
    }

    @Override
    public String avaliarPaciente(String[] sintomasInformados) {
        return "";
    }
}
