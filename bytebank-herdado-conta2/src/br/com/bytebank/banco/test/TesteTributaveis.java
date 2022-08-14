package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(333, 3344);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.CIposto(cc);
		calc.CIposto(seguro);//método de soma 
		
		System.out.println(calc.getTotalImposto());// imposto total atribuido a variavel calc
	}

}
