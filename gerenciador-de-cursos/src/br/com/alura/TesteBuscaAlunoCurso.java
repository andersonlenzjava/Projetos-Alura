package br.com.alura;

public class TesteBuscaAlunoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do java", "paulo");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 22));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 26));
		javaColecoes.adiciona(new Aula("Criando aula", 33));

		Aluno a1 = new Aluno("Rodrigo Turi", 33333);
		Aluno a2 = new Aluno("Maiki", 22223);
		Aluno a3 = new Aluno("Mauricio", 44444);
		Aluno a4 = new Aluno("fabio 33", 33333);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);//vai sob escrever no map o outros que possui 33333
		
		System.out.println(javaColecoes.getAlunos());
		System.out.println("Quem é o aluno com matriula 33333?");
		Aluno aluno = javaColecoes.buscaMatriculado(33333);
		System.out.println("aluno: " + aluno);

	}

}
