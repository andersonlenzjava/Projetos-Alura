
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		//referencia e tipo de instânica, só pode chamar métodos relacionados ao tipo da referencia
		//Funcionario g1 = new Gerente();//herarquia dos construtores 

		Gerente g1 = new Gerente();
		g1.setNome("Maike");
		g1.setSalario(2000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2000);

		Design d = new Design();
		d.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);//chama o método bonificação, conforme o tipo de classe declarada (objeto)
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());//soma as bonficações de todos
		
	}

}
