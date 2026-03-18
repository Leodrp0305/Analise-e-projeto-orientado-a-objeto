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
Descritivo: Faça um programa que converta uma temperatura em graus Celsius para Fahrenheit, utilizando a fórmula:
F = (C × 9/5) + 32.
*******************************************************************************/
public class exercicio04{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha a unidade de temperatura");
		System.out.println("1 - Graus Celsius");
		System.out.println("2 - Fahrenheit");
		System.out.println("Opção: ");
		int opcao = sc.nextInt(); 												/*Recebe a opção*/
		if(opcao == 1) { 														/*Se for Celsius*/
			System.out.println("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = (c * 9/5) + 32;
			System.out.println("A temperatura em Fahrenheit é " + f + "°F");
		}else if (opcao == 2) { 												/*Se for Fahrenheit*/
			System.out.println("Digite a temperatura em Fahrenheit: ");
			double f = sc.nextDouble();
			double c = (f-32) * 5/9;
			System.out.println("A temperatura em Celsius é " + c + "°C");
		} else {
			System.out.println("Opção inválida"); 								/*Pro besta que vai colocar 3*/
		}
		sc.close();
	}
}
