
package galaxia.champs.game;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Nave {

	private int x;
	private int y;
	private int dx;
	private int dy;
	private int pos;
	private Image imagem;
	private boolean isVisivel;

	private static final int LARGURA = 52;
	private static final int ALTURA = 62;
	/*
	 * ============================================METODO NAVE
	 */
	public Nave() {
		ImageIcon referencia = new ImageIcon("res/player/nave.png");
		imagem = referencia.getImage();
		pos = 0;

		// DEFINE POSIÇÃO INICIAL NO JOGO
		x = 330; // HORIZONTAL
		y = 600; // VERTICAL

		// DEFINE NAVE VISIVEL
		isVisivel = true;
	}

	public void mover() {
		x += dx;
		y += dy;

		// TRATAMENTO PARA NÃO SAIR DA TELA
		if (this.x < 1) {// MIN HORIZONTAL (INICIA DA ESQUERDA)
			this.x = 1;
		}
		if (this.x > 560) {// MAX HORIZONTAL (CRESCE PARA A DIREITA)
			this.x = 560;

		}

		if (this.y < 30) {// MIN VERTIAL (INICA DE CIMA)
			this.y = 30;
		}

		if (this.y > 480) {// MAX VERTICAL(CRESCE PARA BAIXO)
			this.y = 480;
		}

	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int Pos) {
		pos = Pos;
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
