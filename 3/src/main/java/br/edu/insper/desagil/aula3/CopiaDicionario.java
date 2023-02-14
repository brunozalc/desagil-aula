package br.edu.insper.desagil.aula3;

import java.util.HashMap;
import java.util.Map;

public class CopiaDicionario {

	public Map<Integer, Double> realiza(Map<Integer, Double> original) {
		Map<Integer, Double> copiada = new HashMap<>();
		for (Integer k : original.keySet()) {
			copiada.put(k, original.get(k));
		}
		return copiada;
	}

}
