package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referenicas;
	private int posicaoLvre;

	public GuardadorDeContas() {
		this.referenicas = new Conta[10];// inicializa o array dentro do construtor
		this.posicaoLvre = 0;
	}

	public void adiciona(Conta ref) {
		this.referenicas[this.posicaoLvre] = ref;
		this.posicaoLvre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLvre;
	}

	public Conta getReferecia(int i) {
		return referenicas[i];
	}

}
