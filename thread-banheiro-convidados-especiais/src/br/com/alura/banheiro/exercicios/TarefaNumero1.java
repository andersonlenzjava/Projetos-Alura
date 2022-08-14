package br.com.alura.banheiro.exercicios;

public class TarefaNumero1 implements Runnable {

	private Banheiro banheiro;//forma de herença por ADAPTADOR
	
	public TarefaNumero1(Banheiro banheiro) {
		super();
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		banheiro.fazNumero1();
	}

}
