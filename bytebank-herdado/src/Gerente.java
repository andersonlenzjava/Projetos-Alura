//gerente é um funcionario pega todas as funcionalidades do funcionario, assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	// super remete a classe superior agora, nao o this que se refere a atributos da
	// classe atual
	public double getBonificacao() {
		System.out.println("chama o método do gerente");
		return super.getSalario();// pega os metodos da classe superior
	}// sobreescrever, o metodo com mesma assinatura em objetos diferentes pode ter
		// funcionalidades diferentes

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);// retorna um boolean

	}
}
