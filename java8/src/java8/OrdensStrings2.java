package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdensStrings2 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		Comparator<String> comparador = new ComparadorPorTamanho2();
//		Collections.sort(palavras);// vai implementar de ordem alfabetica por defaut 
//		Collections.sort(palavras, comparador); //ordem implementada 
		palavras.sort(comparador);// agora a propria lista tem o m�todo sort
		System.out.println(palavras);
		
//		for (String p : palavras) {
//			System.out.println(p);
//		}

		Consumer<String> consumidor = new ImprimeNaLinha2();
		palavras.forEach(consumidor);

	}

}	

class ImprimeNaLinha2 implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}

//um m�todo criado customizado 
class ComparadorPorTamanho2 implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

}
