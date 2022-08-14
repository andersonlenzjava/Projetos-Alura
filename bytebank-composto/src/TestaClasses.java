
public class TestaClasses {

	public static void main(String[] args) {

		Cliente anderson = new Cliente();// referencia para o clinete
		anderson.nome = "Anderson Lenz";
		anderson.cpf = "444.33333.2222";
		anderson.profissao = "programador";

		Conta contaDoAnderson = new Conta();
		contaDoAnderson.deposita(100);

		//associa o cliente anderson a contaDoAnderson, uma parte com uma flexa apontando para outro
		contaDoAnderson.titular = anderson;// o titular é um endereço para a classe cliente
		System.out.println(contaDoAnderson.titular.nome);// caminho entre as classes conforme os endereços
		System.out.println(contaDoAnderson.titular);// caminho entre as classes conforme os endereços
		System.out.println(anderson);

	}

}
