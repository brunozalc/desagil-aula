package br.edu.insper.desagil.aula2;

public class Calculadora {

	public double executa(int a, int b, char op) {
	    double r;
	    if (op == '+') {
	        r = a + b;
	    } else if (op == '-') {
	        r = a - b;
	    } else if (op == '*') {
	        r = a * b;
	    } else if (op == '/') {
	    	if (a == 0 || b == 0) {
	    		r = 0.0;
	    	}
	    	else {
	    		r = (double) a / b;
	    	}
	    } else {
	        r = 0.0;
	    }
	    return r;
	}

}
