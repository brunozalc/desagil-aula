package br.edu.insper.desagil.aula3;

import java.util.*;

public class Nomes {

	public Map<String, List<String>> inverte(Map<String, List<String>> sobrenomes) {
		Map<String, List<String>> invertida = new HashMap<>();
		for (String nome : sobrenomes.keySet()) {
			for (String sobrenome : sobrenomes.get(nome)) {
				if (invertida.containsKey(sobrenome)) {
					invertida.get(sobrenome).add(nome);
				} else {
					List<String> nomes = new ArrayList<>();
					nomes.add(nome);
					invertida.put(sobrenome, nomes);
				}
			}
		}
		return invertida;
	}

}
