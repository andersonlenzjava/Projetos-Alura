package bytebank;

public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();//a variavel (objeto) recebe a poss da memoria (referencia)
		
		primeiraConta.saldo = 200;
		System.out.println("Primeira conta saldo 1: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Primeira conta saldo 2: " + primeiraConta.saldo);

		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 400;
		System.out.println("Segunda conta saldo 1: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		if(primeiraConta == segundaConta) {
			System.out.println("são a mesma conta ");
		}else {
			System.out.println("as contas são diferentes ");//pois são endereços diferentes 
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		System.out.println(primeiraConta.titular);
	}

}
