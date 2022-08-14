
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		//precisa instanciar os dois objetos, onde o titular recebe o endereço da conta cliente (FLEXAS, REFERÊNCIAS, ENDEREÇOS)
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);
		
		//precisa que este endereço seja criado para poder atribuir as variaveis 
		contaDaMarcela.titular.nome = "Marcela";//colocou marcela no espaço da memória objeto
		System.out.println(contaDaMarcela.titular.nome);
		
	}

}
