public abstract class Diagnostico {
    protected String[] sintomasComuns;

    public Diagnostico(String[] sintomasComuns) {
        this.sintomasComuns = sintomasComuns;
    }

    public abstract String avaliarPaciente(String[] sintomasInformados);

    public void exibirSintomasComuns() {
        for (String sintoma : sintomasComuns) {
            System.out.println("- " + sintoma);
        }
    }
}
