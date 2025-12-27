package player;

import projectile.Projectile;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Player implements KeyListener {

    private int x, y, width, height;
    private int speed;
    private Direction direction;

    private ArrayList<Projectile> projectiles;

    private boolean up, down, left, right;

    public Player(int x, int y, int width, int height){

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = 5;

        projectiles = new ArrayList<>();

    }

    public void draw(Graphics2D g){

        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);

        for (Projectile p : projectiles){

            p.draw(g);

        }

    }

    public Direction getDirection(){

        return direction;

    }

    public enum Direction{
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public void update(){

        if (up){
            y -= speed;
        }
        if (down){
            y += speed;
        }
        if (left){
            x -= speed;
        }
        if (right){
            x += speed;
        }



    }

    public void shoot(){

        projectiles.add(new Projectile(x, y, getDirection()));

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP){
            this.up = true;
            direction = Direction.UP;
        }
        if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN){
            this.down = true;
            direction = Direction.DOWN;
        }
        if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT){
            this.left = true;
            direction = Direction.LEFT;
        }
        if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT){
            this.right = true;
            direction = Direction.RIGHT;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP){
            this.up = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN){
            this.down = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT){
            this.left = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT){
            this.right = false;
        }

    }
}
