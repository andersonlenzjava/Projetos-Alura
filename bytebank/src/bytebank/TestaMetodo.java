package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoAnderson = new Conta();

		contaDoAnderson.saldo = 100;
		contaDoAnderson.deposita(50);
		System.out.println(contaDoAnderson.saldo);

		boolean conseguiuRetirar = contaDoAnderson.saca(20);// armazena o retorno do método
		System.out.println(contaDoAnderson.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		if (contaDaMarcela.trasfere(3000, contaDoAnderson)) {// ja tem o conta da marcela junto//realiza a operação
																// junto
			System.out.println("operação realizada com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(contaDaMarcela.saldo);

		boolean transferenciaRealizada = contaDaMarcela.trasfere(300, contaDoAnderson);// recebe o que o método retorna

		if (transferenciaRealizada) {
			System.out.println("operação realizada com sucesso 2");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		contaDoAnderson.titular = "Anderson Lenz";
		System.out.println(contaDoAnderson.titular);
	}

}
