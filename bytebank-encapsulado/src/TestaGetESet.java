
public class TestaGetESet {
	
	///diferentes referências para os mesmos endereços
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337;//nao funciona mais 
		conta.setNumero(1337);//para encapsulamento
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		
		paulo.setNome("paulo Silveira");
		conta.setTitular(paulo);//faz a ligação entre a conta e o cliente seta ele como o dono da conta 
		
		//diferentes formas de acessar o mesmo endereço
		
		System.out.println(conta.getTitular());
		System.out.println(conta.getTitular().getNome());
		//faz o caminhos do objeto conta, associado a cliente
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas 
		Cliente titularDaConta = conta.getTitular();//atribui a variavel titular da conta o endereço do objeto
		titularDaConta.setProfissao("programador");
		
		//estes três são vetores que apontam para o mesmo objeto
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}

}
