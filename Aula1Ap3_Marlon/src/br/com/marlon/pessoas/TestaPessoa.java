package br.com.marlon.pessoas;

import java.util.ArrayList;

public class TestaPessoa {
//735323918
	public static void main(String[] args) {
		Pessoa marlon = new Pessoa();
		marlon.setNome("Marlon Danilo");
		marlon.setAltura(1.8f);
		marlon.setIdade(20);

		Pessoa xico = new Pessoa();
		xico.setNome("Xico Arruda");
		xico.setAltura(1.6f);
		xico.setIdade(30);

		System.out.println(xico);
		System.out.println(marlon);
		
		ArrayList listaDePessoas = new ArrayList();
		for (int i = 0; i < 99999; i++) {
			System.out.println(i);
		listaDePessoas.add(marlon);
		listaDePessoas.add(xico);
		listaDePessoas.add(marlon);
		listaDePessoas.add(xico);
		

		}

	}

}
