package exercicios;
import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado
/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orienta a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Componentes:
25185655-2 - Leonardo Kenji Tanida Soares
25127107-2 - Tiago Joslin Ferreira Mendes
25011023-2 - Lucas Coelho Suero
26008977-2 - Pedro Augusto Cordeiro Holanda
Data: 12 de Março de 2026
Descritivo:   Escreva um programa que ordene um array de números em ordem crescente.
*******************************************************************************/
public class exercicio10 {

    public static void main(String[] args) { // inicio do programa

        Scanner scanner = new Scanner(System.in); // cria o objeto para leitura de dados

        int[] numeros = new int[5]; // Cria o array com o tamanho 5

        for (int i = 0; i < 5; i++) { // loop para o usuário digitar os números
            System.out.print("Digite o numero " + (i + 1) + ": "); // pede o número
            numeros[i] = scanner.nextInt(); // guarda o número na posição do array
        }

        for (int i = 0; i < 5 - 1; i++) { //for para ordenacao
            for (int j = 0; j < 5 - 1 - i; j++) { // percorre o array
                if (numeros[j] > numeros[j + 1]) { // se o numero atual for maior que o proximo faz oque esta abaixo
                    int temp = numeros[j]; // guarda o valor atual temporariamente
                    numeros[j] = numeros[j + 1];  //coloca o proximo valor na posição atual
                    numeros[j + 1] = temp; // coloca o valor guardado na próxima posição
                }
            }
        }

        System.out.println("Array em ordem crescente:"); // mensagem de saída

        for (int num : numeros) { // Loop para mostrar o array ordenado
            System.out.print(num + " "); // imprime os numeros 
        }

        scanner.close(); // Fecha o Scanner
    }
}

