// NÃO É NECESSÁRIO ENTENDER NEM MODIFICAR ESTE CÓDIGO.

package br.edu.insper.desagil.aula4.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import br.edu.insper.desagil.aula4.Ship;

class Panel extends JPanel implements KeyListener {
	private static final long serialVersionUID = 1L;

	private static final int CELL_SIZE = 50;
	private static final int WIDTH = 7;
	private static final int HEIGHT = 5;

	private final int width;
	private final int height;
	private final Image background;
	private final Image sprite;
	private final Ship ship;

	Panel() {
		this.width = WIDTH * CELL_SIZE;
		this.height = HEIGHT * CELL_SIZE;
		this.background = readImage("/background.png");
		this.sprite = readImage("/sprite.png");
		this.ship = new Ship(3, 2);
		Dimension dimension = new Dimension(width, height);
		setPreferredSize(dimension);
	}

	private Image readImage(String path) {
		InputStream stream = Panel.class.getResourceAsStream(path);
		Image image;
		try {
			image = ImageIO.read(stream);
		} catch (IOException exception) {
			throw new UncheckedIOException(exception);
		}
		return image;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(background, 0, 0, width, height, null);

		int x = ship.getX() * CELL_SIZE;
		int y = ship.getY() * CELL_SIZE;
		g.drawImage(sprite, x, y, CELL_SIZE, CELL_SIZE, null);
	}

	@Override
	public void keyPressed(KeyEvent event) {
		switch (event.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			ship.move(-1, 0);
			break;
		case KeyEvent.VK_RIGHT:
			ship.move(1, 0);
			break;
		case KeyEvent.VK_UP:
			ship.move(0, -1);
			break;
		case KeyEvent.VK_DOWN:
			ship.move(0, 1);
			break;
		default:
			System.err.println("unknown key");
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent event) {
	}

	@Override
	public void keyTyped(KeyEvent event) {
	}
}
