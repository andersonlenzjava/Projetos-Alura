package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv")); 
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
		//	System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);//usar regras de separação numerica americada "."
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();//ser especifico no next pode ser feito mas tem de saber os tipos na sequencia
			int conta = linhaScanner.nextInt();//ja faz o parse
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d - %04d, %s: %010.3f", 
					tipoConta, agencia, conta, titular, saldo);//define a formatação dos separadores 
			System.out.println(valorFormatado);//poderia ser direto system.out.format
			
			linhaScanner.close();
			
//			String [] valores = linha.split(",");//separador da string 
//			System.out.println(Arrays.toString(valores));//pega melhor estes valores separados 
//			System.out.println(valores[3]);//pega melhor estes valores separados 
		}
		
		scanner.close();
	}

}
