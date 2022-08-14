package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorContas {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(33, 333);
		guardador.adiciona(cc);//guarda a referênica da conta no array
		
		Conta cc2 = new ContaCorrente(33, 353);
		guardador.adiciona(cc2);//guarda a referênica da conta no array
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferecia(1);
		System.out.println(ref.getNumero());
	}

}
