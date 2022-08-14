package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

//		Conta cc = new ContaCorrente(33, 111);
//		Conta cc2 = new ContaCorrente(33, 111);
//
//		boolean igual = cc.equals(cc2);
//
//		System.out.println(igual);

		ArrayList<Conta> lista = new ArrayList<Conta>();// � uma lista de ref do tipo conta, dentro dos generics <>

		Conta cc = new ContaCorrente(33, 111);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(33, 222);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(33, 222);
//		lista.add(cc3);

		boolean existe = lista.contains(cc3);// verifica a refer�ncias
		lista.add(cc3);
		
		System.out.println("J� existe: " + existe);

		for (Conta conta : lista) {
			boolean ja = conta.equals(cc3);
			System.out.println(ja);
		}
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
