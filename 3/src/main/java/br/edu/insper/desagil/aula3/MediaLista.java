package br.edu.insper.desagil.aula3;

import java.util.List;

public class MediaLista {

	public double calcula(List<Integer> numeros) {
		if (numeros.size() == 0) {
			return 0;
		}
		double s = 0;
		for (int n : numeros) {
			s += (double) n / numeros.size();
		}
		return s;
	}

}
