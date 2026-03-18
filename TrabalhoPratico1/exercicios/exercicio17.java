package exercicios;
import java.util.Random;
import java.util.Scanner;
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
Descritivo: Desenvolva um jogo onde o computador sorteie um número entre 1 e 100, e o usuário tente adivinhá-lo.
O programa deve dar dicas ("maior" ou "menor") até o acerto.
*******************************************************************************/
public class exercicio17 {
	
	public static void main(String[] args) {
		Random randomizador = new Random(); //criando randomizador
		Scanner sc = new Scanner(System.in); 
		int segredo = randomizador.nextInt(100); //selecionando o número aleatorio para o jogo
		
		while(true){ //um while true para requisitar o número e verificar e o número selecionado estava correto
			System.out.println("Digite um número:");
			int guess = sc.nextInt();
			if (guess < segredo) { //por meio de ifs, temos as dicas de maior ou menor 
				System.out.println("maior");
			}else if(guess > segredo){
				System.out.println("menor");
			}else {
				break; //caso o numero nao seja maior, nem menor(ou seja correto) o while é parado
			}
		}
		System.out.println("Parabéns! O número era " + segredo); //impressão da mensagem de vitória
	}
/******************************************************************************
Comecei inicializando o scanner e o randomizador
Após isso, eu gerei o número secreto, que seria o alvo do jogo
Dentro de um while true, que serveria como um do while, eu requisitei um numero para o usuario
apos o inteiro ser inserido, ele é tratado por if, else if e else os quais dão as dicas ou executam o break
após todo o while, temos a mensagem de vitoria impressa pelo sysout
*******************************************************************************/
}
