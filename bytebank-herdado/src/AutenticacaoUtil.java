
public class AutenticacaoUtil {

	//a alogica de autentica��o fica em um s� lugar e pela heran�a permite implementar em outros locais
	
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
