package br.com.jean.diagnostico;

public abstract class Diagnostico {
    protected String[] sintomasComuns;

    public Diagnostico(String[] sintomasComuns) {
        this.sintomasComuns = sintomasComuns;
    }
}
