package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa moldura de uma conta
 * 
 * @author ander
 *
 */

public abstract class Conta implements Serializable {

	protected double saldo;// atributos,propriedades
	private int agencia;
	private int numero;
	private Cliente titular;// toda conta tem um objeto titular do tipo objeto cliente
	private static int total = 0;// um pouco de variavel global

	/**
	 * Construturo para inicializar o objeto conta a partir da agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 */

	// construtor //interessante pode receber parametros e transferir para os
	// atributos
	// controle fino do que é obrigatório para o objeto conforme a regra de negócio
	// dispensa o seters
	public Conta(int agencia, int numero) {
		Conta.total++;// atributo da classe !!!
		// System.out.println("o total de contas é " + Conta.total);

		this.agencia = agencia;// desta conta, nao da classe.
		this.numero = numero;
		// System.out.println("Estou construindo o objeto " + this.numero);
	}

	// abstract obriga as filhas a implementarem
	public abstract void deposita(double valor); // função sem retorno// saldo = saldo + valor;

	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoIsuficienteException
	 */

	public void saca(double valor) throws SaldoIsuficienteException {// função que retorna um bolea, e recebe um valor
		if (this.saldo < valor) {
			throw new SaldoIsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;

	}

	public void trasfere(double valor, Conta destino) throws SaldoIsuficienteException {// indica o segundo tipo de
																						// variavel que recebe
		this.saca(valor);// tenta sacar o valor, e se nao conseguir sai abrutamente da pilha
		destino.deposita(valor);// reutilizar um método
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {// posso implementar algumas regras de negócio aqui//variavel temporaria
		if (numero <= 0) {
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}

		this.numero = numero;// por isto precisa do this //diferenciar a variavel temporária
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {// retorna o total de contas criadas
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		
//fazendo um cast de para chamar os metodos mais especifico, ja que pega um metodo da classe mais geral object
//fazendo a nossa propria regra de igualdade, pegando a referencia 
		Conta outra = (Conta) ref;
		
		if (this.agencia != outra.agencia) {
			return false;
		}
		if (this.numero != outra.numero) {
			return false;
		}
		return true;// se chegar aqui em baixo true
	}

	@Override
	public String toString() {
		return " Numero: " + this.numero + " Agencia: " + this.agencia;

		// return super.toString();//chama o metoda da clase mae
	}

}
