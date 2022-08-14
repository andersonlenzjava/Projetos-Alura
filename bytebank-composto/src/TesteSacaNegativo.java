
public class TesteSacaNegativo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(200)); // realiza a operação e ja retorna o resultado
		
		System.out.println(conta.getSaldo());
		
		//proibido acessar a setagem dos atributos, suas modificações tem de ser feito por métodos
		//System.out.println(conta.saldo);
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
		
	}
	
}
