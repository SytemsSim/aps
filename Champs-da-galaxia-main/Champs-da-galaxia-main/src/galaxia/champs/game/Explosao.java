package galaxia.champs.game;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class Explosao implements ActionListener {
    private int cont;
    private int x, y;
    private Image imagem;

    // POSIÇÃO DA IMAGEM EXPLOÃO
    private static final int LARGURA = 52, ALTURA = 64;

    public Explosao(int x, int y) {
        ImageIcon referencia = new ImageIcon("res/explosao/explosao.png");
        imagem = referencia.getImage();

        this.x = x;
        this.y = y;
        this.cont = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cont++;
    }

    public int getCont() {
        return cont;
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

    public Image getImagem() {
        return imagem;
    }
}
