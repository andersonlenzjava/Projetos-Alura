package br.com.alura.threads.exercicios;

public class TarefaImprimeNumeros implements Runnable {

//	private int i = 0;
//
//	public TarefaImprimeNumeros(int i) {
//		this.i = i;
//	}
	
	public TarefaImprimeNumeros() {
	}

	@Override
	public void run() {

//		for (int t = 0; t < 1000; t++) {
//			System.out.println("ID" + i + "Execução" + t);
//		}
		
		for (int t = 0; t < 1000; t++) {
			System.out.println(Thread.currentThread().getId() + " - " + t);
		}
		
	}

}
