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
Descritivo: Escreva um programa que defina uma interface Veiculo com métodos acelerar() e frear(), e implemente
essa interface em uma classe Carro.
*******************************************************************************/
public class exercicio13 {
	
	interface Veiculo { //criando interface
	    void acelerar();
	    void frear();
	}
	public class Carro implements Veiculo {

	    @Override
	    public void acelerar() {
	        System.out.println("O carro está acelerando");
	    }

	    @Override
	    public void frear() {
	        System.out.println("O carro está freando");
	    }
	}
}