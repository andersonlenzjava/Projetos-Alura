package br.com.alura.banheiro;

public class Banheiro {

	// chega aqui e sincroniza os m?todos
	
	//EXECUTAR DE MANEIRA ATOMICA, OU SEJA UMA UNICA VEZ CADA THREAD 

	public void fazNumero1() {
		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		synchronized (this) {
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
		}
	}

	public void fazNumero2() {
		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		// tarefas atomicas
		synchronized (this) {
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
		}
	}
}
