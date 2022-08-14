
public class TestaValores {

	public static void main(String[] args) {

		Conta conta = new Conta(444, 666);
		

		System.out.println("agencia é " + conta.getAgencia());
		
		Conta conta2 = new Conta(444, 644466);
		
		System.out.println(Conta.getTotal());//total do numero de contas retornado pela classe
	}

}
