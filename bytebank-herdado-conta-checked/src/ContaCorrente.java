
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);// usando o construtor gen�rico da classe superior
	}

	@Override // anota��o do c�digo java significa sobreescrever o c�digo // o poliformismo
				// vai chamar ele
	public void saca(double valor) throws SaldoIsuficienteException {
		double valorASacar = valor + 0.2;// faz algo a mais, sobreescrito
		super.saca(valorASacar);// chama o m�todo saca original
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
