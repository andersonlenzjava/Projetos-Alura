package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoIsuficienteException;

//br.com.bytebank.banco.test.TestaContas
public class TestaContas {

	public static void main(String[] args) throws SaldoIsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 333);
		cp.deposita(200.0);

		System.out.println("cc "+cc.getSaldo());
		System.out.println("cp "+cp.getSaldo());
		
		cc.trasfere(10.0, cp);
		
		System.out.println("cc "+cc.getSaldo());
		System.out.println("cp "+cp.getSaldo());
	}

}
