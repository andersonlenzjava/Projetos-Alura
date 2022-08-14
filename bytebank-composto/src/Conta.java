

public class Conta {

	private double saldo;// atributos,propriedades
	int agencia;
	int numero;
	Cliente titular;//toda conta tem um objeto titular do tipo objeto cliente
	

	public void deposita(double valor) {// função sem retorno
		// saldo = saldo + valor;
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {// função que retorna um bolea, e recebe um valor
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
			destino.deposita(valor);// reutilizar um método
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	

}
