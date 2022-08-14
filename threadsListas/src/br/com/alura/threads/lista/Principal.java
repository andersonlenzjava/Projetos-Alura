package br.com.alura.threads.lista;

public class Principal {

	public static void main(String[] args) throws InterruptedException {

		Lista lista =new Lista();//vecto é uma list threadsafe 
		
		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdcionarElemento(lista, i)).start();
		}
		new Thread(new TarefaImprimir(lista)).start();
	}
}
