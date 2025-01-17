package br.edu.insper.desagil.aula8.past;

import java.util.List;

public class Estatistica {

	public double variancia(List<Integer> numeros) {
		double s;

		double m = getM(numeros);

		s = 0.0;
		for (int n : numeros) {
			double d = n - m;
			s += d * d;
		}
		return s / numeros.size();
	}

	private static double getM(List<Integer> numeros) {
		double s;
		s = 0.0;
		for (int n : numeros) {
			s += n;
		}
		double m = s / numeros.size();
		return m;
	}

}
