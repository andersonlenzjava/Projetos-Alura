package br.com.bytebank.banco.modelo;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImpost() {
		return 42;//valor aleat�rio fixo
	}

}
