
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		//referencia e tipo de inst�nica, s� pode chamar m�todos relacionados ao tipo da referencia
		//Funcionario g1 = new Gerente();//herarquia dos construtores 

		Gerente g1 = new Gerente();
		g1.setNome("Maike");
		g1.setSalario(2000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2000);

		Design d = new Design();
		d.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);//chama o m�todo bonifica��o, conforme o tipo de classe declarada (objeto)
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());//soma as bonfica��es de todos
		
	}

}
