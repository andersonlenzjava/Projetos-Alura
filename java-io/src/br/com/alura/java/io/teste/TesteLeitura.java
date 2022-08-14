package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		//fluxo de entrada com arquivo // padrão decorator
		FileInputStream fis = new FileInputStream("lorem.txt");//entrada binaria com uma classe
		Reader isr = new InputStreamReader(fis);//saida char com outra classe
		BufferedReader br = new BufferedReader(isr);//transforma para poder usar string
		
		String linha = br.readLine();//devolve um nulo quando termina 
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();
	}

}
