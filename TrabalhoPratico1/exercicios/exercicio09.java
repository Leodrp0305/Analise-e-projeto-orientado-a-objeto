package exercicios;
import java.util.Scanner; // Importa a classe Scanner, usada para ler dados do teclado
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
Descritivo:  Criar uma calculadora simples de quatro operações (+ - * /).
*******************************************************************************/


public class exercicio09 {// declara a classe principal
    public static void main(String[] args) { // onde o programa começa

        Scanner scanner = new Scanner(System.in); // cria o objeto scanner para ler oque o usuario digitar

        float num1, num2; // declara duas variáveis para armazenar números (aceita decimais)

        char operacao; // declara uma variável para armazenar o operador (+, -, *, /)

        System.out.print("Digite o primeiro numero: "); // pede o primeiro numero ao usuario
        num1 = scanner.nextFloat(); // guarda o numero

        System.out.print("Digite o operador (+, -, *, /): "); // Pede o operador
        operacao = scanner.next().charAt(0);// guarda o operador

        System.out.print("Digite o segundo numero: "); // pede o segundo número
        num2 = scanner.nextFloat(); // le o segundo número

        double resultado; // declara variável para guardar o resultado da operação

        switch (operacao) { // estrutura que escolhe qual operação será feita

            case '+': // Se o operador for +
                resultado = num1 + num2; // Soma os dois números
                System.out.println("Resultado: " + resultado); // Mostra o resultado
                break; // Encerra esse caso

            case '-': // Se o operador for -
                resultado = num1 - num2; //  faz subtracao
                System.out.println("Resultado: " + resultado); // Mostra o resultado
                break; // Encerra esse caso

            case '*': // se o operador for *
                resultado = num1 * num2; // multiplica
                System.out.println("Resultado: " + resultado); // Mostra o resultado
                break; // Encerra esse caso

            case '/': // Se o operador for /
                if (num2 != 0) { // ve se o segundo número nao é zero
                    resultado = num1 / num2; // divide
                    System.out.println("Resultado: " + resultado); // Mostra o resultado
                } else { // Caso o número seja zero
                    System.out.println("Erro: divisão por zero!"); // Mostra erro
                }
                break; // Encerra esse caso

            default: // Se o operador não for nenhum dos anteriores
                System.out.println("Operação inválida!"); // Mostra erro
        }
    }
}
/*
primeiro usei o scanner para ler os dados do usuário
depis declarei duas variáveis para os números e uma para o operador, depois
pedi para o usuário digitar o primeiro número, o operador e o segundo número
apos receber os valores usei um switch para verificar qual operação foi escolhida
cada caso realiza uma operação diferente (soma, subtração, multiplicação ou divisão)
na divisão, fiz uma verificação para evitar divisão por zero
se o operador digitado não for válido, o programa mostra uma mensagem de erro
tudo estando certo o resultado da operação é exibido na tela
*/
