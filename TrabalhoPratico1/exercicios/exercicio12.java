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
Descritivo: Escreva um programa que use herança para criar uma classe Aluno que herda de Pessoa e adiciona um atributo matricula.
*******************************************************************************/
	
class Pessoa {

    String nome; // atributo nome
    int idade;   // atributo idade

    // Método para exibir os dados da pessoa
    void exibirDados() {
        System.out.println("Nome: " + nome);   // mostra o nome
        System.out.println("Idade: " + idade); // mostra a idadee
    }
}

// classe Aluno herda de Pessoa
class Aluno extends Pessoa {

    String matricula; // atributo exclusivo de Aluno

    // metodo para exibir todas as info 
    void exibirDadosAluno() {
        exibirDados(); // chama o método da classe Pessoa
        System.out.println("Matricula: " + matricula); // mostra a matrícula
    }
}

// classe principal
public class exercicio12 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno(); // cria um objeto da classe Aluno

        a1.nome = "Lucas";      // atributo herdado de Pessoa
        a1.idade = 20;          // atributo herdado de Pessoa
        a1.matricula = "12345"; // atributo próprio de Aluno

        a1.exibirDadosAluno(); // mostra todos os dados
    }
}


