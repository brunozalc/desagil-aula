package br.edu.insper.desagil.aula2;

public class Arvore {

	public String constroi(int n) {
	    String a = "";
	    for (int i = 0; i < n; i++) {
	        int j;
	        for (j = 0; j < n - i - 1; j++) {
	            a += " ";
	        }
	        for (j = 0; j < i; j++) {
	            a += "/";
	        }
	        a += "|";
	        for (j = 0; j < i; j++) {
	            a += "\\";
	        }
	        a += "\n";
	    }
	    return a;
	}
}