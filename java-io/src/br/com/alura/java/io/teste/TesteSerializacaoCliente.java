package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
	//	escrita criação do objeto
		Cliente cliente = new Cliente();
		cliente.setNome("Ander");
		cliente.setProfissao("Dev");
		cliente.setCpf("3334444333");
		
		//para enviar um objeto entre computadores via um arquivo 
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente1 = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getProfissao());
		
	}

}
