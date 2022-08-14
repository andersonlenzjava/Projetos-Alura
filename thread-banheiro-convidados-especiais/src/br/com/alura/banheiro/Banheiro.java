package br.com.alura.banheiro;

public class Banheiro {

	private boolean ehSujo = true;

	// chega aqui e sincroniza os métodos

	// EXECUTAR DE MANEIRA ATOMICA, OU SEJA UMA UNICA VEZ CADA THREAD

	public void fazNumero1() {
		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		synchronized (this) {
			System.out.println(nome + " entrando no banheiro");

			while (ehSujo) {
				esperaLaFora(nome);
			}
			
			System.out.println(nome + " fazendo coisa rapida");

			dormeUmPouco();

			this.ehSujo = true;
			
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

			while (ehSujo) {
				esperaLaFora(nome);
			}

			System.out.println(nome + " fazendo coisa demorada");

			dormeUmPouco();
			
			this.ehSujo = true;

			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando a mao");
			System.out.println(nome + " saindo do banheiro");
		}
	}


	public void limpa() {
		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		// tarefas atomicas
		synchronized (this) {
			System.out.println(nome + " entrando no banheiro");

			if (!ehSujo) {
				System.out.println(nome + ", não está sujo, vou sair");
				return;
			}

			System.out.println(nome + " limpando o banheiro");
			this.ehSujo = false;

			dormeUmPouco();
			
			this.notifyAll(); //notifica todos que o banheiro vai estar limpo
			
			System.out.println(nome + " saindo do banheiro");
		}
	}
	
	private void dormeUmPouco() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void esperaLaFora(String nome) {
		System.out.println(nome + ", eca, banheiro tá sujo");
		try {
			this.wait();//espera la fora 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
