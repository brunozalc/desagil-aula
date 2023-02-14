package br.edu.insper.desagil.aula3;

import java.util.List;

public class SomaLista {

	public int calcula(List<Integer> numeros) {
		int s = 0;
		for (int i : numeros) {
			s += i;
		}
		return s;
	}

}
