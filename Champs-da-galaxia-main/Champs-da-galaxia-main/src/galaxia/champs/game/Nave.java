package galaxia.champs.game;

import java.awt.Image;
import javax.swing.ImageIcon;

public class nave {

	private int x;
	private int y;
	private int dx;
	private int dy;
	private int posicao;
	private Image imagem;
	private boolean inimigo_visivel;

	private static final int largura = 52;
	private static final int altura = 62;
/*metodo da nave*/
	public nave() {
		ImageIcon referencia = new ImageIcon("res/player/nave.png");
		imagem = referencia.getImage();
		posicao = 0;

/*defini posicaoicao inicial da nave*/
		x = 330; 
		y = 600; 

/*mostra a nave*/
		inimigo_visivel = true;
	}

	public void mover() {
		x += dx;
		y += dy;

/*permanecer na tela*/
		if (this.x < 1) { /*inicia na esquerda*/
			this.x = 1;
		}
		if (this.x > 560) { /*aumenta para a direita*/
			this.x = 560;

		}

		if (this.y < 30) { /*inicia em cima*/
			this.y = 30;
		}

		if (this.y > 480) { /*cresce para baixo*/
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
		return posicao;
	}

	public void setPos(int Pos) {
		posicao = Pos;
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
