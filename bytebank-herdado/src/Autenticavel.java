
//contrato autenticavel 
	//quem assina esse contrato, precisa implentar as obrigações 
		//quem são os métodos SetSenha
		//metodo autentica

public abstract interface Autenticavel {

	// somente a assinatura dos métodos
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
