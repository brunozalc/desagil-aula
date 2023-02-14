package br.edu.insper.desagil.aula3;

import java.util.Map;

public class Centro {

	public double calcula(Map<String, Double> notas) {
		double min = Double.POSITIVE_INFINITY;
		double max = Double.NEGATIVE_INFINITY;

		for (double nota : notas.values()) {
			if (min > nota) {
				min = nota;
			} if (max < nota) {
				max = nota;
			}
		}

		return (min + max) / 2;
	}

}
