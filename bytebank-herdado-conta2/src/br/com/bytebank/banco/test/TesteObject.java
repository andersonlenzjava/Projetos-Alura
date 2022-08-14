package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);

		Object cc = new ContaCorrente(222, 333);//referenia generica que referencia um objeto mais especifico
		Object cp = new ContaPoupanca(3444, 222);
		Object cliente = new Cliente();
		
		System.out.println(cc);//vai usar o metodo mais especifico em detrimento do mais geral
		System.out.println(cp);//tem embutido um metodo to strin 
		
//		println(cc);
//		println(cliente);

	}

	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
	static void println(Object referencia) {}
}
