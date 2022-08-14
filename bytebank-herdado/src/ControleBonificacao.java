
public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario f) {//objeto g do tipo gerente
		double boni = f.getBonificacao();//atribui a variavel boni a bonificação (e chama o metodo especifico da clase filha)
		this.soma = this.soma + boni;//atribui a variavel soma ela + a bonificaçao do gerente
	}
	
	public double getSoma() {
		return soma;
	}
}

