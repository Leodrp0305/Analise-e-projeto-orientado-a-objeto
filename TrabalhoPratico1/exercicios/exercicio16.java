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
Descritivo:  Escreva um programa que valide uma senha de acordo com os seguintes critérios:
-Pelo menos 8 caracteres
-Pelo menos uma letra maiúscula
-Pelo menos uma letra minúscula
-Pelo menos um número
*******************************************************************************/
public class exercicio16 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //criar scanner
	
	System.out.println("=============={Validador de senhas}==============");
		System.out.println("Sua senha deve conter:" //instruções para o usuario
				+ "\n - Pelo menos 8 caracteres"
				+ "\n - Pelo menos uma letra maiúscula"
				+ "\n - Pelo menos uma letra minúscula"
				+ "\n - Pelo menos um número");
		while(true) { //while true para o sistema pedir a senha até estar correta
			boolean maiusculo = false; //criando variaveis booleanas para condições
			boolean digitos = false;
			boolean minusculo = false;
			boolean numero = false;
		System.out.println("Digite sua nova senha:");//requisitando a senha
		String senha = sc.next();
		
		int lonjura = senha.length(); //usando length para saber quantos caracteres existem em uma string
		
		if (lonjura >= 8) {
			digitos = true;
			}
		for (char c : senha.toCharArray()) { //for para ler caracteres
		    if (Character.isUpperCase(c)) { //lendo cada caractere e usando isUpper para verificar se é maiusculo
		       maiusculo = true;
		    	}
			}
		for (char c : senha.toCharArray()) {//for para ler caracteres
		    if (Character.isLowerCase(c)) {//lendo cada caractere e usando isLower para verificar se é minusculo
		       minusculo = true;
		    	}
			}
		
		for (char c : senha.toCharArray()) {//for para ler caracteres
		    if (Character.isDigit(c)) {//lendo cada caractere e usando isLower para verificar se é minusculo
		       numero = true;
		    	}
			}
		
		if(!digitos) {
			System.out.println("Digite uma senha com pelo menos 8 caracteres");
		}
		if(!maiusculo) {
			System.out.println("Digite uma senha com pelo menos um caractere maiusculo");
			}
		if(!minusculo) {
			System.out.println("Digite uma senha com pelo menos um caractere minusculo");}
		if(!numero) {
			System.out.println("Digite uma senha com pelo menos um número");}
		
		if (digitos & maiusculo & minusculo & numero) {break;}
		}
		System.out.println("Senha registrada com sucesso!");

	}
/******************************************************************************
- Incializando variaveis booleanas como false
- depois requisitamos uma string por meio de um scanner
- agora que vinha parte dificil, né, eu utilizei de variaveis booleanas para poder reforçar as instruções do codigo
- caso a senha não se adequasse a alguma das condições, o if resposavel por tornar a booleana responsavel em true não seria ativado
- em seguida, após todos os testes, outros 4 ifs seriam executados, imprimindo as mensagens de erro correspondentes a senha
- caso tudo tivesse correto, a senha seria "registrada"
-dentro do codigo eu tive que pesquisar como poderia encontrar a lengh, por tanto usei o comando .lengh, assim como usei o UpperCase,LowerCase e Digits
-todos correram dentro de um for para analizar caractere por caractere dentro da senha
*******************************************************************************/
}
