package galaxia.champs.game;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Tiro1 {

	private int x, y;
	private Image imagem;
	private boolean inimigo_visivel;
	private static final int velocidade = 2;
	private static final int altura = 50;
	private static final int largura = 20;
	
	public Tiro1(int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon referencia = new ImageIcon("res/armas/laiser.png");
		imagem = referencia.getImage();
		inimigo_visivel = true;
	}

	public void mover() {
		y -= velocidade;
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
		return altura;
	}

	public int getLar() {
		return largura;
	}

	public boolean inimigo_visivel() {
		return inimigo_visivel;
	}

	public void setVisivel(boolean visivel) {
		inimigo_visivel = visivel;
	}

}
