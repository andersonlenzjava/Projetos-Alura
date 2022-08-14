
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel A1 = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("caio");
		g1.setCpf("44552222");
		g1.setSalario(3000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autentica = g1.autentica(2222);
		
		System.out.println(autentica);
		
		System.out.println(g1.getBonificacao());
	}

}
