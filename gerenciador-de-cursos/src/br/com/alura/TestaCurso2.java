package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do java", "paulo");
		
		//adiciona para o curso java coleções uma nova aula 
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 22));//com o read only no get nao funciona
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 22));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 26));
		javaColecoes.adiciona(new Aula("Criando aula", 33));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);	
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);//cria uma segunda lista e esta é mutavel (copia)
		
		Collections.sort(aulas);
		System.out.println(aulas);	
		System.out.println(javaColecoes.getTempoTotal());	
		
		System.out.println(javaColecoes);
		
	}

}
