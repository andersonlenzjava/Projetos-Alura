
public class AutenticacaoUtil {

	//a alogica de autenticação fica em um só lugar e pela herança permite implementar em outros locais
	
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

}
