package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiaArquivo {

	public static void main(String[] args) throws IOException {
		// fluxo de entrada com arquivo // padrão decorator
		FileInputStream fis = new FileInputStream("lorem.txt");// entrada binaria com uma classe
		Reader isr = new InputStreamReader(fis);// saida char com outra classe
		BufferedReader br = new BufferedReader(isr);// transforma para poder usar string

		OutputStream fos = new FileOutputStream("lorem2.txt");// entrada binaria com uma classe
		Writer osw = new OutputStreamWriter(fos);// saida char com outra classe
		BufferedWriter bw = new BufferedWriter(osw);// transforma para poder usar string

		String linha = br.readLine();// devolve um nulo quando termina
		while (linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		br.close();
		bw.close();
	}

}
