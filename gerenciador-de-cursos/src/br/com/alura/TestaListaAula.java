package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revisitar arraylist", 42);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);//pega o to string
		
		Collections.sort(aulas);
		
		System.out.println(aulas);//pega o to string
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));//segundo metodo de ordenação com sitaxe propria
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));// mesmo efeito que a linha 26
		
	}

}
