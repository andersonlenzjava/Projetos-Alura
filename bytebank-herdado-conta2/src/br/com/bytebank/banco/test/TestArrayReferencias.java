package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {

	public static void main(String[] args) {

//		int[] idades = new int[5];
		//ContaCorrente[] contas = new ContaCorrente[5];// criou um array que pode guardar 5 refs, inicial null
		Conta[] contas = new Conta[5];//agora pode ser conta corrente ou conta poupan�a, poliformismo.
//		Object[] contas = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(44, 22);
		contas[0] = cc1;
		System.out.println(contas[0]);

		ContaPoupanca cc2 = new ContaPoupanca(43, 42);
		contas[1] = cc2;
		System.out.println(cc2);
		System.out.println(contas[1].getNumero());//permite que eu acesse os metodos pois � uma copia da ref
	
		ContaPoupanca ref = (ContaPoupanca) contas[1];//precisa avisar quando quer fazer algo mais especifico
//		ContaCorrente ref = contas[1];// para esta nova configura��o nao compila pois tem de ser mesmo ref
//		Conta ref = contas[1]; //tem de ser do tipo mais gen�rico
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
	}

}
