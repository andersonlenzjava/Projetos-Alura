package br.com.alura.threads.exercicios;

//colocar dentro da classe runable o que se deseja operar em paralelo
//pode ser somente o chamado do outro metodo
public class threadImprimirString implements Runnable{

	@Override
	public void run() {
		System.out.println("resposta");
	}

	
}
