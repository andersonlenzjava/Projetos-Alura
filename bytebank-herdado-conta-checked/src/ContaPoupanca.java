
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {//reaproveitando o construtor, n�o herda automaticamente
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
}
