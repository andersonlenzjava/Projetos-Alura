
public class CalculadorImposto {

	private double totalImposto;

	public void CIposto(Tributavel t) { // n�o retorna nada, composi��o 
		double valor = t.getValorImpost();
		this.totalImposto += valor;
	}

	public double getTotalImposto() { // retorna o calculo realizado
		return totalImposto;
	}
}
