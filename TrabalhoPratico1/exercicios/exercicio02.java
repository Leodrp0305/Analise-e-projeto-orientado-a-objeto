package exercicios;
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
Descritivo: Escreva um programa que leia um número inteiro e informe se ele é par ou ímpar.
*******************************************************************************/
public class exercicio02{
	public static void main(String[] args) {
		int var1 = 7;
		int var2 = var1%2; 									/*var2 igual o resto entre var1 e 2*/
		
		if(var2 == 1) {
			System.out.println("O número é ímpar");
		}else {
			System.out.println("O número é par");
		}
	}
}
