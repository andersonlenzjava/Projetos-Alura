package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29);// autoboxing
		System.out.println(idadeRef.intValue());//unboxing
		
		Double dref = Double.valueOf(3.2);//autoboxing
		System.out.println(dref.doubleValue());// unboxing
		
		Boolean bRef = Boolean.TRUE;//box // poderia ser "= false" que ele automaticamente faz a conversao
		System.out.println(bRef.booleanValue());//unbox
	
		Number refNumer = Float.valueOf(29.9F);//precisa do f para indicar que é float
		//herança refereciar um objeto mais generico, apartir de um mais especifico, e nao é abstrata a classe 
		System.out.println(refNumer);//unbox
		
		List<Number> lista = new ArrayList<>();
		lista.add(33);
		lista.add(11.3);
		lista.add(25.4f);
		
	}

}
