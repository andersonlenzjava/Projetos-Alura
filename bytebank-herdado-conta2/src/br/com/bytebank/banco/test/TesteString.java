package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		//TEM O STRING BUILDER TAMBÉM
		
		String vazio = "     ALURA ";
		
		System.out.println(vazio.contains("ALU"));
		
		System.out.println(vazio);
		String outraVazio = vazio.trim();//recebe o retorno do metodo, limpo dos espaços
		System.out.println(outraVazio);
		
//		System.out.println(vazio.isEmpty());//remove os espaços vazios
//		System.out.println(outraVazio.isEmpty());//checa se a string esta vazia
		
		String nome = "AlurA";// objeto nome inicializa como um string alura //nao pode ser alterado
		// String outro = new String("Alura");// igual ao de cima, mas não é boa pratica
		
		System.out.println(nome.length());
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);//o restante apartir desta posição 
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		char c = nome.charAt(1);// retorna o char na posição 
//		System.out.println(c);
		
//		System.out.println(nome);
//		char c = 'A';
//		char d = 'a';
//		String outra = nome.replace(c, d);//altera as strings

//		String outra = nome.replace("A", "a");//altera as strings
//		String outra = nome.replace('A', 'a');//altera as strings
//		String outra = nome.toLowerCase();
//		System.out.println(outra);

	}

}
