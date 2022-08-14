package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoAnderson = new Conta();

		contaDoAnderson.saldo = 100;
		contaDoAnderson.deposita(50);
		System.out.println(contaDoAnderson.saldo);

		boolean conseguiuRetirar = contaDoAnderson.saca(20);// armazena o retorno do m�todo
		System.out.println(contaDoAnderson.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		if (contaDaMarcela.trasfere(3000, contaDoAnderson)) {// ja tem o conta da marcela junto//realiza a opera��o
																// junto
			System.out.println("opera��o realizada com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(contaDaMarcela.saldo);

		boolean transferenciaRealizada = contaDaMarcela.trasfere(300, contaDoAnderson);// recebe o que o m�todo retorna

		if (transferenciaRealizada) {
			System.out.println("opera��o realizada com sucesso 2");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		contaDoAnderson.titular = "Anderson Lenz";
		System.out.println(contaDoAnderson.titular);
	}

}
