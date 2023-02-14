package br.edu.insper.desagil.aula2;

public class Tabuada {

	public String constroi(int n) {
		String l = "";
		for (int i = 1; i < n+1; i++) {
			for (int j = 1; j < n+1; j++) {
				int r = i * j;
				l += r + " ";
			}
			l += "\n";
		}
		return l;
	}

}
