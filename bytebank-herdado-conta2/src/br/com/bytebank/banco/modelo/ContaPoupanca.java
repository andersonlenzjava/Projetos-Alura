package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {//reaproveitando o construtor, não herda automaticamente
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public String toString() {
		return "ContaPopuanca" + super.toString();
		
		//return super.toString();//chama o metoda da clase mae 
	}
}
