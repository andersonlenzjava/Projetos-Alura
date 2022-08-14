package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>(); //conjunto nao tem ordem, e nao aceita elementos repetidos
		alunos.add("aalenz");
		alunos.add("sseeer");
		alunos.add("sdsfdsdfser");
		alunos.add("sdfadfr");
		alunos.add("serrwerr");
		alunos.add("svvvvv");
		alunos.add("svvvvv");
		
		boolean pauloEstaMatriculado = alunos.contains("aalenz");//todas as listas tem o metodo contains
		alunos.remove("sseeer");
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos.size());
		
		for (String string : alunos) {
			System.out.println(string);
		}
		
		System.out.println(alunos);
	}

}
