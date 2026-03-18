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
Descritivo: Escreva um programa que calcule a média de três notas fornecidas pelo usuário.
*******************************************************************************/
public class exercicio03{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escrevas suas notas");
		int n1 = sc.nextInt(); 									/*Guarda a nota*/
		int n2 = sc.nextInt();
		int n3= sc.nextInt();
		
		int media = (n1 + n2 + n3)/3;
		System.out.println("A sua média é:" + media);
		sc.close();
	}
}
