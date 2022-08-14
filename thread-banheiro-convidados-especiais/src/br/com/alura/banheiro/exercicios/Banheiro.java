package br.com.alura.banheiro.exercicios;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banheiro {

	// chega aqui e sincroniza os métodos atomicos
	private Lock lock = new ReentrantLock(); //outra forma de fazer estas operações parapelas 

	public void fazNumero1() {
		String nome = Thread.currentThread().getName();

		lock.lock();
//		boolean locked = lock.tryLock(5, TimeUnit.SECONDS); //5s //pode ser implementado isto também
		System.out.println(nome + " entrando no banheiro");
		System.out.println(nome + " fazendo coisa rapida");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(nome + " dando descarga");
		System.out.println(nome + " lavando a mao");
		System.out.println(nome + " saindo do banheiro");
		lock.unlock();
	}

	public void fazNumero2() {
		String nome = Thread.currentThread().getName();

		// tarefas atomicas
		lock.lock();
		System.out.println(nome + " entrando no banheiro");
		System.out.println(nome + " fazendo coisa demorada");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(nome + " dando descarga");
		System.out.println(nome + " lavando a mao");
		System.out.println(nome + " saindo do banheiro");
		lock.unlock();
	}

}
