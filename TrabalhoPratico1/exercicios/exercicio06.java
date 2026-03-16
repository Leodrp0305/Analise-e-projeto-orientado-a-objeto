package exercicios;
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
Descritivo: Escreva um programa que use herança para criar uma classe Aluno que herda de Pessoa e adiciona um
atributo matricula.
*******************************************************************************/
public class exercicio06 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);// Abrindo scanner
	int i;
	int[] vetor = new int[5];//iniciando vetor de 5 de largura
	
	System.out.println("++++| Sistema requere 5 números |++++");//fru fru
	
	for (i=0;i<5;i++) { //for para scanear 5 vezes ao inves de escrever 5 vezes
		
	System.out.println("Digite um número:"); //pedindo para digitar
	int num = sc.nextInt(); //lendo o numero digitado pelo usuário
	vetor[i] = num; //salvando no array
	}
	sc.close(); //fechando scanner após fechamento do for
	
	System.out.println("Os números digitados foram:"); //fru fru parte 2
	for (i=0;i<5;i++) { //for para varrer vetor lendo os numeros digitados
		System.out.println(vetor[i]); //impressão dos números lidos
		}
	}
}
