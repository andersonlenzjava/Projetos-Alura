package br.com.bytebank.banco.test.util;

public class TesteWrapperInterger {

	public static void main(String[] args) {

		int idade = 29;// interger
		// Integer idadeRef = new Integer(29);
		Integer idadeRef = Integer.valueOf(29);// forma de criar um objeto para manipulala (embrulhar)
		System.out.println(idadeRef.doubleValue());//converte em um double 
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue();// forma de trazer de volta para int (desimbrulhar)
		String s = args[0];// "10"
//		Integer numero = Integer.valueOf(s);// passar uma string para um interger
		int numero = Integer.parseInt(s);// passa para um inteiro
		System.out.println(numero);
		System.out.println(valor);
		System.out.println(idade);
		
//		List<Integer> numeros = new ArrayList<Integer>();
//		numeros.add(29);// autoboxing interno com um interger de baixo dos panos, cria um objeto virtual do int
					
	}

}
