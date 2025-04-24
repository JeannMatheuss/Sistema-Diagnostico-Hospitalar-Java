package br.com.jean.diagnostico.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiagnosticoCovidTest {

    @Test
    public void testDiagnosticoComSintomasCompatíveis() {
        DiagnosticoCovid covid = new DiagnosticoCovid();
        String[] sintomas = {"febre", "tosse seca", "dificuldade para respirar"};
        String resultado = covid.avaliarPaciente(sintomas);

        assertTrue(resultado.contains("Provável Covid"));
    }

    @Test
    public void testDiagnosticoComPoucosSintomas() {
        DiagnosticoCovid covid = new DiagnosticoCovid();
        String[] sintomas = {"coceira no olho"};
        String resultado = covid.avaliarPaciente(sintomas);

        assertTrue(resultado.contains("Poucos sintomas"));
    }
}
