package galaxia.champs.game;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class explosao implements ActionListener {
    private int cont;
    private int x, y;
    private Image imagem;

/*imagem de explosao*/
private static final int largura = 52, altura = 64;

public explosao(int x, int y) {
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
    return altura;
}

public int getLar() {
    return largura;
}

public Image getImagem() {
    return imagem;
}
}
