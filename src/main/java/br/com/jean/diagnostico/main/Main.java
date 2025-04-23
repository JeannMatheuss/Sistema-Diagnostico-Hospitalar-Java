package br.com.jean.diagnostico.main;

import br.com.jean.diagnostico.model.DiagnosticoGripe;
import br.com.jean.diagnostico.model.DiagnosticoCovid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os sintomas separados por vírgula:");
        String entrada = scanner.nextLine();
        String[] sintomasInformados = entrada.toLowerCase().split(",");

        for (int i = 0; i < sintomasInformados.length; i++) {
            sintomasInformados[i] = sintomasInformados[i].trim();
        }

        DiagnosticoGripe diagnosticoGripe = new DiagnosticoGripe();
        DiagnosticoCovid diagnosticoCovid = new DiagnosticoCovid();

        System.out.println("\n--- Diagnóstico Gripe ---");
        diagnosticoGripe.exibirSintomasComuns();
        System.out.println(diagnosticoGripe.avaliarPaciente(sintomasInformados));

        System.out.println("\n--- Diagnóstico Covid ---");
        diagnosticoCovid.exibirSintomasComuns();
        System.out.println(diagnosticoCovid.avaliarPaciente(sintomasInformados));
    }
}
