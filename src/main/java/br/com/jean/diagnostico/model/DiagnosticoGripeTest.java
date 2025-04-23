package br.com.jean.diagnostico.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiagnosticoGripeTest {

    @Test
    public void testDiagnosticoComSintomasCompatíveis() {
        DiagnosticoGripe gripe = new DiagnosticoGripe();
        String[] sintomas = {"febre", "tosse", "dor de cabeça"};
        String resultado = gripe.avaliarPaciente(sintomas);

        assertTrue(resultado.contains("Provável Gripe"));
    }

    @Test
    public void testDiagnosticoComPoucosSintomas() {
        DiagnosticoGripe gripe = new DiagnosticoGripe();
        String[] sintomas = {"dor muscular"};
        String resultado = gripe.avaliarPaciente(sintomas);

        assertTrue(resultado.contains("Poucos sintomas"));
    }
}
