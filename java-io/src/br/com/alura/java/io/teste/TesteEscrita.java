package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		//fluxo de entrada com arquivo // padrão decorator
		OutputStream fos = new FileOutputStream("lorem2.txt");//entrada binaria com uma classe
		Writer osw = new OutputStreamWriter(fos);//saida char com outra classe
		BufferedWriter bw = new BufferedWriter(osw);//transforma para poder usar string
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		bw.newLine();
		bw.newLine();
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
	
		bw.close();
	}

}
