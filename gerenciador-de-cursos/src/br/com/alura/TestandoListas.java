package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "conhecendo mais de listas";
		String aula2 = "Modelaido a classe aula";
		String aula3 = "Trabalhando com cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);// toString vai ser chamado

		aulas.remove(0);

		System.out.println(aulas);// toString vai ser chamado

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);

		System.out.println(aulas.size());

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		
		System.out.println("-------------");
	
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
	
		System.out.println("-------------");
		
		aulas.forEach(aula -> {
			System.out.println("Percorendo");
			System.out.println("Aula: " + aula);
		});
		
		System.out.println("-------------");
		
		aulas.add("Aumentando o conhecimento");
		System.out.println(aulas);//tem o to string junto
		System.out.println("-------------");
		Collections.sort(aulas);//ordenando via classe collections
		System.out.println(aulas);//tem o to string junto

	}

}
