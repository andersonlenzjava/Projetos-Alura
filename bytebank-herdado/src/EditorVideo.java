//gerente é um funcionario pega todas as funcionalidades do funcionario
public class EditorVideo extends Funcionario {

	public EditorVideo() {

	}

	// super remete a classe superior agora, nao o this que se refere a atributos da
	// classe atual
	public double getBonificacao() {
		System.out.println("chama o método do editor video");
		return 150;// pega os metodos da classe superior
	}// sobreescrever, o metodo com mesma assinatura em objetos diferentes pode ter
		// funcionalidades diferentes
}
