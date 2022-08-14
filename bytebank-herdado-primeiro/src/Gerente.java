//gerente é um funcionario pega todas as funcionalidades do funcionario
public class Gerente extends Funcionario{

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public Gerente() {

	}
	//super remete a classe superior agora, nao o this que se refere a atributos da classe atual
	public double getBonificacao() {
		System.out.println("chama o método do gerente");
		return super.getBonificacao() + super.getSalario();//pega os metodos da classe superior 
	}//sobreescrever, o metodo com mesma assinatura em objetos diferentes pode ter funcionalidades diferentes
}
