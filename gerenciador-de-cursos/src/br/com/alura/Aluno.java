package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int i) {
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser nulo!");//teria que ter um retorno aqui 
		}
		this.nome = nome;
		this.numeroMatricula = i;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {// da para gerar direto peloas atalhos
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);//para ser igual suas strings precisa ser iguais 
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}

}
