/******************************************************************************
Curso - Engenharia de Software
turma - ESOFT3A
Professor - José Carlos Flores
Componentes:
  251856552 - Leonardo Kenji Tanida Soares
  251271072 - Tiago Joslin Ferreira Mendes
  250110232 - Lucas Coelho Suero
  260089772 - Pedro Augusto Cordeiro Holanda
Data - 18/03/2026
Descritivo -  O programa identifica qual é a fruta mais pesada dentro de um lote
informado pelo usuário, usando lógica de comparação em array.
******************************************************************************/
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
/******************************************************************************
- Meu primeiro passo no código foi pesquisar como eu poderia comparar vários valores dentro de uma lista para achar o maior, então eu encontrei o conceito de variável de referência.
- Por meio de um método chamado acharOMaior, eu defini que a primeira fruta do array seria a minha "campeã" inicial, e usei um laço for para percorrer o restante do estoque.
- Usando um if, o programa comparava cada posição do array: se a fruta atual fosse maior que a campeã, ela assumia o trono. No fim, o que sobrava na variável era o peso da maior fruta de todas.
******************************************************************************/
