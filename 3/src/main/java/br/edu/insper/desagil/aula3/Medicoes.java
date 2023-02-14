package br.edu.insper.desagil.aula3;

import java.util.Map;

public class Medicoes {

	public void normaliza(Map<Integer, Double> medicoes) {
		double s = 0;
		for (Double v : medicoes.values()) {
			s += v;
		}
		for (Integer k : medicoes.keySet()) {
			medicoes.put(k, medicoes.get(k) / s);
		}
	}

}
