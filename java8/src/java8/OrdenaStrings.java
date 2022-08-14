package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura 123345567678");
		palavras.add("editora 123");
		palavras.add("Caelum  33333");

		System.out.println(palavras);
		// Comparator<String> comparador = new ComparadorPorTamanho();

//		Collections.sort(palavras, comparador);//por em ordem pelo criterio deste novo metodo //por defaut é alfabet
		// palavras.sort(comparador);

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));//lambda mais objetivo 
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));//meotodo lengh da string
		
//		Function<String, Integer> funcao = String::length;
//		Function<String, Integer> funcao2 = s -> s.length();
		
		
		System.out.println(palavras);

//		for (String p : palavras) {
//			System.out.println(p);
//		}//substituida por esta abaixo
		Consumer<String> consumidor = new ImprimeNaLinha2();// a classe consumidora será uma de onde vem os objetos
		palavras.forEach(consumidor);

		System.out.println("=============");
		palavras.forEach(s -> System.out.println(s));// lambda
		
//		palavras.forEach(System.out::println);

	}

}

class ImprimeNaLinha implements Consumer<String> {
	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() < o2.length())
			return -1;
		if (o1.length() > o2.length())
			return 1;
		return 0;
	}

}
