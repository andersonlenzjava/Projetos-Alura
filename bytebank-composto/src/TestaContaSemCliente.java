
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		//precisa instanciar os dois objetos, onde o titular recebe o endere�o da conta cliente (FLEXAS, REFER�NCIAS, ENDERE�OS)
		contaDaMarcela.titular = new Cliente();
		System.out.println(contaDaMarcela.titular);
		
		//precisa que este endere�o seja criado para poder atribuir as variaveis 
		contaDaMarcela.titular.nome = "Marcela";//colocou marcela no espa�o da mem�ria objeto
		System.out.println(contaDaMarcela.titular.nome);
		
	}

}
