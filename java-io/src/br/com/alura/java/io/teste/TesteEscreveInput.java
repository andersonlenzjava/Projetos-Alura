package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteEscreveInput {

	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket();
		
		// fluxo de entrada com arquivo // padrão decorator
		InputStream fis = s.getInputStream(); //System.in;// entrada binaria com uma classe
		Reader isr = new InputStreamReader(fis);// saida char com outra classe
		BufferedReader br = new BufferedReader(isr);// transforma para poder usar string

		OutputStream fos = s.getOutputStream();//new FileOutputStream("lorem3.txt");// entrada binaria com uma classe
		Writer osw = new OutputStreamWriter(fos);// saida char com outra classe
		BufferedWriter bw = new BufferedWriter(osw);// transforma para poder usar string

		String linha = br.readLine();// devolve um nulo quando termina
		
		while (linha != null && linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		br.close();
		bw.close();
	}

}
