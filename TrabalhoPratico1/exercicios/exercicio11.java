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
Descritivo:    Escreva um programa que defina uma classe Pessoa com atributos nome e idade, e métodos para exibir esses atributos.
*******************************************************************************/

// Define a classe Pessoa
class Pessoa {

    String nome; // atributo para armazenar o nome
    int idade;   // atributo para armazenar a idade

    // Método para exibir os dados da pessoa
    void exibirDados() {
        System.out.println("Nome: " + nome);   // mostra o nome
        System.out.println("Idade: " + idade); // mostra a idade
    }
}

// Classe principal 
public class exercicio11 {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(); // cria um objeto da classe Pessoa

        p1.nome = "Lucas"; // define o nome da pessoa
        p1.idade = 19;     // define a idade da pessoa

        p1.exibirDados(); // Chama o método para mostrar os dados
    }
}
    

