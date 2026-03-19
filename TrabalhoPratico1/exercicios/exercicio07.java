/******************************************************************************
Curso - Engenharia de Software
turma - ESOFT3A
Professor - José Carlos Flores
Componentes:
  251856552 - Leonardo Kenji Tanida Soares
  240013102 - Jonathan de Lima Bellato
  251271072 - Tiago Joslin Ferreira Mendes
  250110232 - Lucas Coelho Suero
  260089772 - Pedro Augusto Cordeiro Holanda
Data - 18/03/2026
Descritivo -  O programa identifica qual é a fruta mais pesada dentro de um lote
informado pelo usuário, usando lógica de comparação em array.
*******************************************************************************/

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantas frutas chegaram no lote? ");
        int qtd = leitor.nextInt();

        double[] estoque = new double[qtd];

        // Lendo os pesos das frutas
        for (int i = 0; i < qtd; i++) {
            System.out.print("Peso da fruta " + (i + 1) + " (gramas): ");
            estoque[i] = leitor.nextDouble();
        }

        // Chama a função que descobre o maior peso
        double maiorPeso = acharOMaior(estoque);

        System.out.println("\n--- RELATÓRIO DE PESAGEM ---");
        System.out.println("A fruta recordista do lote tem: " + maiorPeso + "g");

        leitor.close();
    }

    // Método para encontrar o maior valor (Lógica de Negócio)
    public static double acharOMaior(double[] lista) {
        double campeao = lista[0]; // Começamos achando que a primeira é a maior

        for (double pesoAtual : lista) {
            if (pesoAtual > campeao) {
                campeao = pesoAtual; // Se achar uma maior, ela assume o trono
            }
        }
        return campeao;
    }
}