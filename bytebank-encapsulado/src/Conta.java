
public class Conta {

	private double saldo;// atributos,propriedades
	private int agencia;
	private int numero;
	private Cliente titular;// toda conta tem um objeto titular do tipo objeto cliente
	private static int total = 0;//um pouco de variavel global 
	
	public Conta() {
		//construtor padrão 
	}
	
	//construtor //interessante pode receber parametros e transferir para os atributos
	//controle fino do que é obrigatório para o objeto conforme a regra de negócio
	//dispensa o seters 
	public Conta(int agencia, int numero) {
		Conta.total++;//atributo da classe !!!
		//System.out.println("o total de contas é " + Conta.total);
		
		this.agencia = agencia;//desta conta, nao da classe.
		this.numero = numero;
	//	System.out.println("Estou construindo o objeto " + this.numero);
	}
	
	public void deposita(double valor) {// função sem retorno// saldo = saldo + valor;
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {// função que retorna um bolea, e recebe um valor
		if (this.saldo >= valor) {
			this.saldo -= valor;// reduz o valor de saca do saldo
			return true;
		} else {
			return false;
		}

	}

	public boolean trasfere(double valor, Conta destino) {// indica o segundo tipo de variavel que recebe
		if (this.saldo >= valor) {
			this.saldo -= valor;// o saldo que recebeu
			destino.deposita(valor);// reutilizar um método
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {// posso implementar algumas regras de negócio aqui//variavel temporaria
		if(numero <= 0) {
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}
		
		this.numero = numero;// por isto precisa do this //diferenciar a variavel temporária
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {//retorna o total de contas criadas 
		return Conta.total;
	}

}
