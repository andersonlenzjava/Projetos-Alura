
//contrato autenticavel 
	//quem assina esse contrato, precisa implentar as obriga��es 
		//quem s�o os m�todos SetSenha
		//metodo autentica

public abstract interface Autenticavel {

	// somente a assinatura dos m�todos
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
