/******************************************************************************
Curso: Engenharia de Software - ESOFT3A
Professor: José Carlos Flores
Componentes:
  251856552 - Leonardo Kenji Tanida Soares
  240013102 - Jonathan de Lima Bellato
  251271072 - Tiago Joslin Ferreira Mendes
  250110232 - Lucas Coelho Suero
  260089772 - Pedro Augusto Cordeiro Holanda
Data: 18/03/2026
Descritivo: O programa lê o peso de 5 frutas, armazena em um array e calcula 
a média de peso do lote no final.
*******************************************************************************/

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Criando o array para 5 frutas (conforme o tema escolhido)
        double[] remessa = new double[5];
        double totalKg = 0;

        System.out.println(">>> SISTEMA DE QUALIDADE: CALCULO DE MEDIA <<<");

        // 1. Entrada de dados e Acúmulo
        for (int i = 0; i < remessa.length; i++) {
            System.out.print("Peso da fruta " + (i + 1) + " (kg): ");
            remessa[i] = teclado.nextDouble();
            
            // Aqui a gente vai somando cada peso novo ao total
            totalKg += remessa[i]; 
        }

        // 2. Cálculo da Média
        double media = totalKg / remessa.length;

        // 3. Exibição dos resultados (Relatório Final)
        System.out.println("\n----------------------------------");
        System.out.printf("Soma Total do Lote: %.2f kg\n", totalKg);
        System.out.printf("Media de Peso: %.2f kg\n", media);
        System.out.println("----------------------------------");

        teclado.close();
    }
}
