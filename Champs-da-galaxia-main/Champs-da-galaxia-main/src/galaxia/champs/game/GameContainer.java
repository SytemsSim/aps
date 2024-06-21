
package galaxia.champs.game;

import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GameContainer extends JFrame {

    private static final long serialVersionUID = 1L;

    private Timer tempo;
    private Timer novos_inimigos;
    private Timer nova_vida;
    private List<inimigo> inimigos;
    private List<Tiro1> tiros;
    private List<adiciona_vida> adicionar_vida;
    private List<Timer> temposicao;
    private List<explosao> explosoes;

    private int contador_pontos = 0;
    private int contador_vida = 3;

/*inicio ou menu*/
public static void main(String args[]) {
    new GameContainer();
}

/*criar a classe*/
protected GameContainer() {

/*nome do jogo*/
    setTitle("Champs da Galáxia");

/*sair do jogo*/
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

/*tamanho da janela do jogo*/
    setSize(600, 600);
    setLocationRelativeTo(null);

/*nao aumentar a janela*/
    setResizable(false);

/*mostrar a janela do jogo*/
    setVisible(true);

/*inicio do menu*/
    iniciar_menu();

/*todos os inimigos*/
    inimigos = new ArrayList<inimigo>();

/*iniciar os inimigos*/
    iniciar_inimigo();

/*tiro 1*/
    tiros = new ArrayList<Tiro1>();

/*vida do player*/
    adicionar_vida = new ArrayList<adiciona_vida>();

/*listar tempo da explosao*/
    temposicao = new ArrayList<Timer>();

/*listar explosao*/
    explosoes = new ArrayList<explosao>();

/*tempo para aparecer os inimigos*/
    novos_inimigos = new Timer(900, new novo_inimigo());
    novos_inimigos.start();

/*tempo para carregar a vida*/
    nova_vida = new Timer(900, new nova_vida());
    nova_vida.start();

/*tempo de velocidade do jogo*/
    tempo = new Timer(5, new Listener());
    tempo.start();
}

private void iniciar_inimigo() {
    for (int i = 0; i < inimigos.size(); i++) {
        inimigos.remove(i);
        i--;
    }
}

public void iniciar_menu() {
    /*menu bar*/
            menu_bar = new JMenuBar();
            setJMenuBar(menu_bar);
    
    /*menu missoes*/
            menu_missao = new JMenu("Missão: " + contMissao);
            menu_missao.setEnabled(true);
            menu_missao.setHorizontalTextPosition(SwingConstants.CENTER);
            menu_missao.setHorizontalAlignment(SwingConstants.CENTER);
            menu_missao.setVerticalAlignment(SwingConstants.BOTTOM);
            menu_missao.setVerticalTextPosition(SwingConstants.BOTTOM);
            menu_missao.setFont(new Font("Century Schoolbook L", Font.PLAIN, 15));
            menu_bar.add(menu_missao);
    
    /*menu vida*/
            menu_vida = new JMenu(" x " + contador_vida);
            menu_vida.setEnabled(true);
            menu_vida.setFont(new Font("Century Schoolbook L", Font.PLAIN, 15));
            menu_bar.add(menu_vida);
    
    /*menu pontuacao*/
            menu_pontuacao = new JMenu("x" + contador_pontos);
            menu_pontuacao.setEnabled(true);
            menu_pontuacao.setFont(new Font("Century Schoolbook L", Font.PLAIN, 15));
            menu_bar.add(menu_pontuacao);
    
    /*menu nao abatidos*/
            menu_naoabatido = new JMenu("Não Abatidos: " + naoAbatidos);
            menu_naoabatido.setEnabled(true);
            menu_naoabatido.setHorizontalTextPosition(SwingConstants.CENTER);
            menu_naoabatido.setHorizontalAlignment(SwingConstants.CENTER);
            menu_naoabatido.setVerticalAlignment(SwingConstants.BOTTOM);
            menu_naoabatido.setVerticalTextPosition(SwingConstants.BOTTOM);
            menu_naoabatido.setFont(new Font("Century Schoolbook L", Font.PLAIN, 15));
            menu_bar.add(menu_naoabatido);
    
    /*menu tempo de jogo*/
            menu_tempo = new JMenu("Tempo: " + t.minutos + ":" + t.segundos);
            menu_tempo.setEnabled(true);
            menu_tempo.setHorizontalTextPosition(SwingConstants.CENTER);
            menu_tempo.setHorizontalAlignment(SwingConstants.CENTER);
            menu_tempo.setVerticalAlignment(SwingConstants.BOTTOM);
            menu_tempo.setVerticalTextPosition(SwingConstants.BOTTOM);
            menu_tempo.setFont(new Font("Century Schoolbook L", Font.PLAIN, 15));
            menu_bar.add(menu_tempo);
        }

        private class novo_inimigo implements ActionListener {
            public void actionPerformed(ActionEvent e) {
    
    /*Lógica para criar novos inimigos*/
                inimigos.add(new inimigo(1 + (int) (550 * Math.random()), -80));
            }
        }

/*Lógica para criar nova vida*/
private class nova_vida implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    }
}

/*Lógica do jogo*/
private class Listener implements ActionListener {
    public void actionPerformed(ActionEvent e) {


/*Colisões entre tiros e inimigo*/
        for (int i = 0; i < tiros.size(); i++) {
            Tiro1 tiro = tiros.get(i);
            for (int j = 0; j < inimigos.size(); j++) {
                inimigo ini = inimigos.get(j);
                if (tiro.getBounds().intersects(ini.getBounds())) {
                    tiros.remove(i);
                    inimigos.remove(j);
                    contador_pontos += 10;
                    i--;
                    break;
                }
            }
        }

/*Colisões entre nave e inimigo*/
for (int i = 0; i < inimigos.size(); i++) {
    inimigo ini = inimigos.get(i);
    if (nave.getBounds().intersects(ini.getBounds())) {
        inimigos.remove(i);
        contador_vida--;
        i--;
                }
            }
        }
    }
}
