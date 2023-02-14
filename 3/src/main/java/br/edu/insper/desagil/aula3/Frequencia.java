package br.edu.insper.desagil.aula3;

import java.util.HashMap;
import java.util.Map;

public class Frequencia {

	public Map<Character, Integer> conta(String s) {
		Map<Character, Integer> frequencias = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (frequencias.containsKey(c)) {
				Integer v = frequencias.get(c);
				frequencias.put(c, v += 1);
			} else {
				frequencias.put(c,1);
			}
		}
		return frequencias;
	}

}
