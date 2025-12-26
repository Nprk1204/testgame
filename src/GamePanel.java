import Inventory.Inventory;
import Item.Item;
import Item.Misc.Coin;
import Item.Weapons.WoodenSword;
import Player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class GamePanel extends JPanel implements KeyListener, MouseListener {

    private int width, height;

    Player player;

    Inventory inventory;

    Coin coin;
    Coin coin2;
    Coin coin3;
    Coin coin4;
    Coin coin5;
    Coin coin6;
    Coin coin7;

    WoodenSword woodenSword;

    ArrayList<Item> items;

    public GamePanel (){

        width = 800;
        height = 600;

        player = new Player(50, 50, 20, 20);
        inventory = new Inventory();

        coin = new Coin(150, 150, 20, 20);
        coin2 = new Coin(150, 200, 20, 20);
        coin3 = new Coin(215, 200, 20, 20);
        coin4 = new Coin(215, 150, 20, 20);
        coin5 = new Coin(235, 150, 20, 20);
        coin6 = new Coin(235, 175, 20, 20);
        coin7 = new Coin(235, 205, 20, 20);

        woodenSword = new WoodenSword(300, 300, 50, 10);

        items = new ArrayList<>();
        items.add(coin);
        items.add(coin2);
        items.add(coin3);
        items.add(coin4);
        items.add(coin5);
        items.add(coin6);
        items.add(coin7);

        items.add(woodenSword);

        setPreferredSize(new Dimension(width, height));
        setBackground(Color.BLACK);
        setFocusable(true);

        this.addKeyListener(player);

        addKeyListener(this);
        addMouseListener(this);

        Timer timer = new Timer(16, e -> {

            update();
            repaint();

        });
        timer.start();

    }

    public void update(){

        player.movement();
        player.stayOnScreen(width, height);

        ArrayList<Item> toRemove = new ArrayList<>();

        for (Item item : items){

            if (player.isCollidingWith(item.getX(), item.getY(), item.getWidth(), item.getHeight())){

                inventory.addItem(item);
                item.setCollected(true);

            }

            if (item.getIsCollected()){
                toRemove.add(item);


            }

        }

        items.removeAll(toRemove);

    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        player.draw(g2);

        for (Item item : items){

            item.draw(g2);

        }

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_O){

            inventory.showItems();

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
