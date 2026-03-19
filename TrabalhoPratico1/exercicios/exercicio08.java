/******************************************************************************
Curso - Engenharia de Software
turma - ESOFT3A
Professor - José Carlos Flores
Componentes:
  251856552 - Leonardo Kenji Tanida Soares
  240013102 - Jonathan de Lima Bellato
  251271072 - Tiago Joslin Ferreira Mendes
  250110232 - Lucas Coelho Suero
Data - 18/03/2026
Descritivo - O programa lê o peso de 5 frutas, armazena em um array e calcula 
a média de peso do lote no final.
*******************************************************************************/

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Array fixo para 5 frutas conforme o enunciado
        double[] remessa = new double[5];
        double totalKg = 0;

        System.out.println(">>> SISTEMA DE QUALIDADE: CALCULO DE MEDIA <<<");

        // Loop para ler e já ir somando tudo no totalKg
        for (int i = 0; i < remessa.length; i++) {
            System.out.print("Peso da fruta " + (i + 1) + " (kg): ");
            remessa[i] = teclado.nextDouble();
            totalKg += remessa[i]; 
        }

        // Faz a conta da média
        double media = totalKg / remessa.length;

        System.out.println("\n----------------------------------");
        System.out.printf("Soma Total do Lote: %.2f kg\n", totalKg);
        System.out.printf("Media de Peso: %.2f kg\n", media);
        System.out.println("----------------------------------");

        teclado.close();
    }
}

/*
- Meu primeiro passo no código foi pesquisar como eu poderia acumular valores de forma automática enquanto o usuário digitava, então eu encontrei o operador de atribuição aditiva +=.
- Por meio de um laço for, eu criei um "baldinho" chamado totalKg. Cada vez que o peso de uma fruta era lido, o += jogava esse valor para dentro do total, somando tudo em uma única variável de forma eficiente.
- Usando o length, eu consegui dividir essa soma total pela quantidade exata de itens no array. Assim, cheguei na média aritmética do lote sem precisar travar o código em um número fixo.
*/
