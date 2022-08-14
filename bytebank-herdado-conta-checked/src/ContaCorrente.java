
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);// usando o construtor genérico da classe superior
	}

	@Override // anotação do código java significa sobreescrever o código // o poliformismo
				// vai chamar ele
	public void saca(double valor) throws SaldoIsuficienteException {
		double valorASacar = valor + 0.2;// faz algo a mais, sobreescrito
		super.saca(valorASacar);// chama o método saca original
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;

	}

	@Override
	public double getValorImpost() {

		return super.saldo * 0.01;
	}

}
