
//n�o pode-se criar objetos desta classe, por que � abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
	
	}
	
	//metodo sem corpo, e sem implementa��o, s� serve de refer�ncia para as classes filhas 
	//obriga os filhos implementem este m�todo
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
