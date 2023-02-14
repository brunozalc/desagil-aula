package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LimpaDicionario {

	public void filtra(Map<Integer, Character> presente, char c) {
		List<Integer> queue = new ArrayList<>();
		for (int i : presente.keySet()) {
			if (presente.get(i) == c) {
				queue.add(i);
			}
		}
		for (int i : queue) {
			presente.remove(i);
		}
	}

}
