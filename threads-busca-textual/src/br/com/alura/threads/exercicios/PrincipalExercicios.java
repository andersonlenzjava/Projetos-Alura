package br.com.alura.threads.exercicios;

public class PrincipalExercicios {

	public static void main(String[] args) {

//		Thread threadImprimeNumerosID1 = new Thread(new TarefaImprimeNumeros(1));
//		Thread threadImprimeNumerosID2 = new Thread(new TarefaImprimeNumeros(2));
//
//		threadImprimeNumerosID1.start();
//		threadImprimeNumerosID2.start();
		
		new Thread((new TarefaImprimeNumeros ())).start();
		new Thread((new TarefaImprimeNumeros ())).start();
	}

}
