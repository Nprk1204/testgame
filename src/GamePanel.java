import player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements KeyListener {

    private int width, height;
    Player player;

    public GamePanel(){

        width = 800;
        height = 600;

        player = new Player(50, 50, 20, 20);

        setFocusable(true);
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(width, height));

        this.addKeyListener(player);
        this.addKeyListener(this);

        Timer timer = new Timer (16, e -> {

            update();
            repaint();

        });
        timer.start();

    }

    public void update(){

        player.update();

    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        player.draw(g2);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_SPACE){

            player.shoot();

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
