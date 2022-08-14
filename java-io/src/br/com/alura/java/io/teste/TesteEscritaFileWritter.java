package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWritter {

	public static void main(String[] args) throws IOException {

		//fluxo de entrada com arquivo // padrão decorator
//		OutputStream fos = new FileOutputStream("lorem2.txt");//entrada binaria com uma classe
//		Writer osw = new OutputStreamWriter(fos);//saida char com outra classe
//		BufferedWriter bw = new BufferedWriter(osw);//transforma para poder usar string
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));//uma linha só para estabelecer a saida 
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		bw.newLine();
		bw.newLine();
		//fw.write(System.lineSeparator());//"\r\n"
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
		
		bw.close();
	}

}
