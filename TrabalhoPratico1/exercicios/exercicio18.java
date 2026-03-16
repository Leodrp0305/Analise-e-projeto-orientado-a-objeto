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
Descritivo: Desenvolva um programa que conte quantas palavras existem em uma string fornecida pelo usuário.
*******************************************************************************/
public class exercicio18 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //criando scanner
	
	System.out.println("=============={Contador de palavras}==============");
	System.out.println("Digite uma frase para utilizar o software:");
	String frase = sc.nextLine(); //após frufru, o sistema pede uma frase para seguir o sistema
	
	String[] contagem = frase.trim().split("\\s+"); //separamos em um array as palavras, dividindo pelos espaços
	int totalPalavras = contagem.length; //contamos quantos itens existem no array da linha 26
	
	System.out.println("Háviam "+totalPalavras+" palavras na frase digitada");//Impressão de resultado
	
	}

}
