package br.com.alura.threads.exercicios;

public class testaImprimeString {

	public static void main(String[] args) {

		Runnable tarefa = new threadImprimirString();
		Thread threadImprime = new Thread(tarefa);
		threadImprime.start();

	}

}
