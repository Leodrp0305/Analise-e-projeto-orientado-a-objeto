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
Descritivo: Escreva um programa que solicite um número inteiro e exiba sua tabuada de 1 a 10.
*******************************************************************************/
public class exercicio14 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int i; //apos inicializar scanner, inicializo variaveis
		System.out.println("Digite o número o qual deseja a tabuada:"); //frufru
		int valor = sc.nextInt(); //pedindo inteiro
		System.out.println("A tabuada do "+ valor + " é:");
		for(i=1;i<=10;i++) { //for para impressão da tabuada
		
		System.out.println(valor +" X "+i+" = "+i*valor);
		}
		sc.close();
	}
}