package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do java", "paulo");
		
		//adiciona para o curso java coleções uma nova aula 
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 22));//com o read only no get nao funciona
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 22));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 26));
		javaColecoes.adiciona(new Aula("Criando aula", 33));
		
		Aluno a1 = new Aluno("Rodrigo Turi", 33333);
		Aluno a2 = new Aluno("Maiki", 22223);
		Aluno a3 = new Aluno("Mauricio", 44444);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
//		Set<Aluno> alunos = javaColecoes.getAlunos();//passa para este novo set a lista 
//		Iterator<Aluno> iterador = alunos.iterator();
//		while(iterador.hasNext()) {//forma paralela ao for each para mapear o array, é problematico, pq nao permite usar denovo
//			Aluno proximo =iterador.next();
//			System.out.println(proximo);
//		}
		
		for(Aluno a : javaColecoes.getAlunos()) {
			System.out.println(a);
		}
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a ->{System.out.println(a);});
		
		
		System.out.println("o Aluno " + a1 + "está matriculado?");
		System.out.println(javaColecoes.estaMatriculdo(a1));
		
		Aluno rodrigo = new Aluno("Rodrigo Turi", 33333);
		System.out.println("E esse Turi, está matriculado?");
		System.out.println(javaColecoes.estaMatriculdo(rodrigo));//sim pois tem o mesmo hashcode
	
		System.out.println("O a1 é equals ao Turini?");
		System.out.println(a1.equals(rodrigo));
		
	}

}
