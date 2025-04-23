package br.com.jean.diagnostico.model;

import br.com.jean.diagnostico.base.Diagnostico;

public class DiagnosticoCovid extends Diagnostico {
    public DiagnosticoCovid(String[] sintomasComuns) {
        super(sintomasComuns);
    }

    @Override
    public String avaliarPaciente(String[] sintomasInformados) {
        return "";
    }
}
