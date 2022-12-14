package br.com.alura.threads;

public class Principal {

	public static void main(String[] args) {

		String nome = "da";
//		String nome = "(Dan|Chad)(\\s|\\w)*"; //busca pelo come?o dos nomes
		
		//varios novos threads, que s?o executados em parelo usando a mesma classe sem sequ?nica
		Thread threadAssinaturas1 = new Thread(new TarefaBuscaTextual("assinaturas1.txt", nome));
		Thread threadAssinaturas2 = new Thread(new TarefaBuscaTextual("assinaturas2.txt", nome));
		Thread threadAutores = new Thread(new TarefaBuscaTextual("autores.txt", nome));
		
		threadAssinaturas1.start();
		threadAssinaturas2.start();
		threadAutores.start();
	}

}
