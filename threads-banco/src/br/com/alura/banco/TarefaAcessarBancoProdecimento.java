package br.com.alura.banco;

public class TarefaAcessarBancoProdecimento implements Runnable {

	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessarBancoProdecimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		
		synchronized (pool) {
			System.out.println("Comecando a tx");
			tx.begin();
			
			synchronized (tx) {
				System.out.println("Peguei a conexao");
				pool.getConnection();
			}
		}
	}

}
