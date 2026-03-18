
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
Descritivo: Implemente uma calculadora de Índice de Massa Corporal (IMC) que receba peso (kg) e altura (m) e
exiba o resultado com a classificação correspondente (ex: abaixo do peso, normal, etc.).
*******************************************************************************/
public class exercicio15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		// Entrada de dados
		System.out.print("Digite seu peso (kg): ");
		double peso = sc.nextDouble();
		
		System.out.print("Digite sua altura (m): ");
		double altura = sc.nextDouble();
		
		// Cálculo do IMC
		double imc = peso / (altura * altura);
		
		// Exibição do resultado
		System.out.printf("Seu IMC é: %.2f\n", imc);
		
		// Classificação
		if (imc < 18.5) {
			System.out.println("Classificação: Abaixo do peso");
		} else if (imc < 25) {
			System.out.println("Classificação: Peso normal");
		} else if (imc < 30) {
			System.out.println("Classificação: Sobrepeso");
		} else if (imc < 35) {
			System.out.println("Classificação: Obesidade grau I");
		} else if (imc < 40) {
			System.out.println("Classificação: Obesidade grau II");
		} else {
			System.out.println("Classificação: Obesidade grau III");
		}
		
		sc.close();
	}
/******************************************************************************
- Nesse codigo, eu pensei em inicializar tudo com o scanner, por ser necessario, então eu criei o sc para receber os valores que seriam necessários
- em seguida, requisitei as variaveis como doubles, para mais precisão
- após receber os dados, eu calculei o imc
- por fim, utilizei de um sistema de if, else if e else, para categorizar o imc e a classificação
- finalizando o codigo com a boa pratica de fechar o scanner para desocupar memoria
*******************************************************************************/
}
