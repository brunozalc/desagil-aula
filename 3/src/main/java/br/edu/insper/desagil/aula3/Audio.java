package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.List;

public class Audio {

	public void clip(List<Integer> onda, int limite) {;
		for (int i = 0; i < onda.size(); i++) {
			int valor = onda.get(i);
			if (valor > limite) {
				onda.set(i, limite);
			}
			else if (valor < -(limite)) {
				onda.set(i, -(limite));
			}
		}
	}

}
