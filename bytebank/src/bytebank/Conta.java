package bytebank;

public class Conta {

	double saldo;// atributos,propriedades
	int agencia;
	int numero;
	String titular;
	String cpf;
	String profissao;

	public void deposita(double valor) {// fun��o sem retorno
		// saldo = saldo + valor;
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {// fun��o que retorna um bolea, e recebe um valor
		if (this.saldo >= valor) {
			this.saldo -= valor;// reduz o valor de saca do saldo
			return true;
		} else {
			return false;
		}

	}

	public boolean trasfere(double valor, Conta destino) {// indica o segundo tipo de variavel que recebe
		if (this.saldo >= valor) {
			this.saldo -= valor;// o saldo que recebeu
			destino.deposita(valor);// reutilizar um m�todo
			return true;
		}
		return false;
	}

}
