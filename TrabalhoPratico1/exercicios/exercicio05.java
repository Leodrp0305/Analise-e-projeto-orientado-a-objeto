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
Descritivo: Escreva um programa que exiba apenas os números pares de 1 a 20.
*******************************************************************************/
public class exercicio05{
	public static void main(String[] args) {
	int contador = 0;
	while(contador <= 20) {
		if(contador%2 == 0) {
			System.out.println(" " + contador);
		}
			contador++;
		}
	}
}
