
public class CalculadorImposto {

	private double totalImposto;

	public void CIposto(Tributavel t) { // não retorna nada, composição 
		double valor = t.getValorImpost();
		this.totalImposto += valor;
	}

	public double getTotalImposto() { // retorna o calculo realizado
		return totalImposto;
	}
}
