package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {


		Curso javaColecoes = new Curso("Dominando as cole��es do java", "paulo");
		
		//adiciona para o curso java cole��es uma nova aula 
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 22));//com o read only no get nao funciona
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 22));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 26));
		javaColecoes.adiciona(new Aula("Criando aula", 33));
		
		System.out.println(javaColecoes.getAulas());	
		
	}

}
