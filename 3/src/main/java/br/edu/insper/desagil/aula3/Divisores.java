package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.List;

public class Divisores {

	public List<Integer> extrai(int n) {
		List<Integer> divisores = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				divisores.add(i);
			}
		}
		return divisores;
	}
}
