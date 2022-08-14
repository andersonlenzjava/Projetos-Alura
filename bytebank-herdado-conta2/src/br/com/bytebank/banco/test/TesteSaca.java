package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;//todas as classes do pacote

public class TesteSaca {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(123, 321);
	
		
		
	cc1.deposita(100.0);
	try {
		cc1.saca(200.0);
	} catch (SaldoIsuficienteException e) {
		e.printStackTrace();
	}
	
	System.out.println(cc1.getSaldo());
	}

}
