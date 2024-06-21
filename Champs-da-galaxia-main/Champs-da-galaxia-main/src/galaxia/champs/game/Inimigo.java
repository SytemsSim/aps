package galaxia.champs.game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class inimigo {

	private double x, y;
	private Image imagem;
	private boolean inimigo_visivel;
	private static final int largura = 50, altura = 52;
	private static int contador = 0;
	private ImageIcon referencia;

/*velocidade do inimigo*/
	private static final double velocidade = 0.5;

	public inimigo(int x, int y) {
		this.x = x;
		this.y = y;

		if (contador++ % 2 == 0) {
			referencia = new ImageIcon("res/inimigos/asteroid32.png");

		} else if (contador++ % 3 == 0) {
			referencia = new ImageIcon("res/inimigos/DeathFighter1.png");

		} else if (contador++ % 4 == 1) {
			referencia = new ImageIcon("res/inimigos/spikeyenemy.png");

		} else {
			referencia = new ImageIcon("res/inimigos/wings.png");

		}
		imagem = referencia.getImage();

/*mostar o inimigo*/
inimigo_visivel = true;
}

public void mover() {
	y += velocidade;
}

public int getAlt() {
	return altura;
}

public int getLar() {
	return largura;
}

public Image getImagem() {
	return imagem;
}

public double getX() {
	return x;
}

public double getY() {
	return y;
}

public void setY(double y) {
	this.y = y;
}

public boolean inimigo_visivel() {
	return inimigo_visivel;
}

public void setVisivel(boolean visivel) {
	inimigo_visivel = visivel;
}

}
