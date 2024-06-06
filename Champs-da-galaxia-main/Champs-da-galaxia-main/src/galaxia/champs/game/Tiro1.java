package galaxia.champs.game;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Tiro1 {

	private int x, y;
	private Image imagem;
	private boolean isVisivel;
	private static final int VELOCIDADE = 2;
	private static final int ALTURA = 50;
	private static final int LARGURA = 20;
	
	public Tiro1(int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon referencia = new ImageIcon("res/armas/laiser.png");
		imagem = referencia.getImage();
		isVisivel = true;
	}

	public void mover() {
		y -= VELOCIDADE;
	}

	public Image getImagem() {
		return imagem;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getAlt() {
		return ALTURA;
	}

	public int getLar() {
		return LARGURA;
	}

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean visivel) {
		isVisivel = visivel;
	}

}
