
public class TestaGetESet {
	
	///diferentes refer�ncias para os mesmos endere�os
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337;//nao funciona mais 
		conta.setNumero(1337);//para encapsulamento
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		
		paulo.setNome("paulo Silveira");
		conta.setTitular(paulo);//faz a liga��o entre a conta e o cliente seta ele como o dono da conta 
		
		//diferentes formas de acessar o mesmo endere�o
		
		System.out.println(conta.getTitular());
		System.out.println(conta.getTitular().getNome());
		//faz o caminhos do objeto conta, associado a cliente
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas 
		Cliente titularDaConta = conta.getTitular();//atribui a variavel titular da conta o endere�o do objeto
		titularDaConta.setProfissao("programador");
		
		//estes tr�s s�o vetores que apontam para o mesmo objeto
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}

}
