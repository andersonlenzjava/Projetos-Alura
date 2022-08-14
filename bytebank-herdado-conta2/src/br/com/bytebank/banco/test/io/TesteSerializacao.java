package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Cliente cliente = new Cliente();
		cliente.setNome("Ander");
		cliente.setProfissao("Dev");
		cliente.setCpf("3334444333");
		
		ContaCorrente cc = new ContaCorrente(444, 3333);
		cc.setTitular(cliente);
		cc.deposita(4444.4);
		
		//para enviar um objeto entre computadores via um arquivo 
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
		
	}

}
