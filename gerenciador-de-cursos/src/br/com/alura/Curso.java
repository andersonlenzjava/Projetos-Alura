package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	// implementa lista em vez de array para ja herdar mais metodos da interface
	// list, parte do poliformismo e composiçao permite mudar depois
	private Set<Aluno> alunos = new HashSet<>();// colleção que nao permite duplicados
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}// um metodo readonly para so ler nao permite setar ou excluir, copia imutavel, permitindo o encapsulamento

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
		
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + "," + "aulas: " + this.aulas + "]";
	}// retorna no this as aulas deste curso com o this

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);// do collections e encapsulado
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);// grava neste map esta relação, para buscas
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);// retorna uma lista virtual copia nao modificavel para mostrar
	}

	public boolean estaMatriculdo(Aluno aluno) {
		return this.alunos.contains(aluno);// contains da classe colection utiliza o equals, mas ele nao tem o hashcode
	}

	public Aluno buscaMatriculado(int numero) {
		if (!matriculaParaAluno.containsKey(numero))
		throw new NoSuchElementException();
		return matriculaParaAluno.get(numero);//pode ser só este retorno, se nao for retorna null
	}
}
