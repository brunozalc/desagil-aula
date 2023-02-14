package br.edu.insper.desagil.aula2;

public class Potencia {

	public int calcula(int b, int e) {
		int p = 1;
		int i = 0;
		while (i < e) {
			p *= b;
			i += 1;
		}
		return p;
	}
}
