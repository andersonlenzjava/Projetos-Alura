package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		//fluxo de entrada com arquivo // padrão decorator
//		OutputStream fos = new FileOutputStream("lorem2.txt");//entrada binaria com uma classe
//		Writer osw = new OutputStreamWriter(fos);//saida char com outra classe
//		BufferedWriter bw = new BufferedWriter(osw);//transforma para poder usar string

//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));//uma linha só para estabelecer a saida 
//		PrintStream ps = new PrintStream(new FileWriter("lorem2.txt"));
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		ps.println();
		ps.println();
		ps.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
		
		ps.close();
	}

}
