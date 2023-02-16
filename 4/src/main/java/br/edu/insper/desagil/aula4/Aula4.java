package br.edu.insper.desagil.aula4;

public class Aula4 {
	public static void main(String[] args) {

		Ship nave = new Ship(2, 1);
		nave.move(-1, -1);
		System.out.println(nave.getX() + " " + nave.getY());

	}
}
