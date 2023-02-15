// NÃO É NECESSÁRIO ENTENDER NEM MODIFICAR ESTE CÓDIGO.

package br.edu.insper.desagil.aula4.view;

import java.awt.Container;

import javax.swing.JFrame;

public class Game {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(() -> {
			Panel panel = new Panel();

			JFrame frame = new JFrame("Aula 4");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.addKeyListener(panel);

			Container container = frame.getContentPane();
			container.add(panel);

			frame.pack();
			frame.setVisible(true);
		});
	}
}
