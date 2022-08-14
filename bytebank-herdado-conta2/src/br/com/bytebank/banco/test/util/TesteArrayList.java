package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();//é uma lista de ref do tipo conta, dentro dos generics <>
		
		Conta cc = new ContaCorrente(33, 111);
		lista.add(cc);//guarda a referênica da conta no arrayList
		Conta cc2 = new ContaCorrente(33, 222);
		lista.add(cc2);//guarda a referênica da conta no arrayList
		
		System.out.println(lista.size());
		Conta ref = (Conta) lista.get(0);//transformando a generica para especifica para ter o metodo  
		System.out.println(ref);
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(33, 333);
		lista.add(cc3);//guarda a referênica da conta no arrayList
		Conta cc4 = new ContaCorrente(33, 444);
		lista.add(cc4);//guarda a referênica da conta no arrayList
		
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("-------------------------------");
		
		for (Conta conta : lista) {//laço foreach
			System.out.println(conta);//ja tem o toString embutido mais aprimorado, pois era para ser pos memoria
		}
		
	}

}
