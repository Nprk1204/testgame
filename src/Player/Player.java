package Player;

import Item.Projectiles.Projectile;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player implements KeyListener {

    private boolean up, down, left, right;

    private Direction facing;

    private int x, y, width, height;
    private int health, maxHealth;
    private int speed;

    public Player(int pX, int pY, int pWidth, int pHeight){

        x = pX;
        y = pY;
        width = pWidth;
        height = pHeight;
        health = 20;
        maxHealth = 20;
        speed = 5;

    }

    public int getX(){

        return x;

    }

    public int getY(){

        return y;

    }

    public int getWidth(){

        return width;

    }

    public int getHeight(){

        return height;

    }

    public int getHealth(){

        return health;

    }

    public int getMaxHealth(){

        return maxHealth;

    }

    public int getSpeed(){

        return speed;

    }

    public boolean isCollidingWith(int objX, int objY, int objWidth, int objHeight){

        return (x < objX + objWidth &&
                x + width > objX &&
                y < objY + objHeight &&
                y + height > objY);

    }

    public Direction getFacing(){

        return facing;

    }

    public void stayOnScreen(int sWidth, int sHeight){

        if (x < 0) {
            x = 0;
        }

        if (y < 0){
            y = 0;
        }

        if (x + width > sWidth){
            x = sWidth - width;
        }

        if (y + height > sHeight){
            y = sHeight - height;
        }

    }

    public enum Direction{
        UP,DOWN,LEFT,RIGHT

    }

    public Projectile shoot(){

        return new Projectile(x + width/2, y + height/2, facing);

    }


    public void draw(Graphics2D g){

        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);

    }

    public void movement(){

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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP){

            up = true;
            facing = Direction.UP;

        }

        if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN){

            down = true;
            facing = Direction.DOWN;

        }

        if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT){

            left = true;
            facing = Direction.LEFT;

        }

        if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT){

            right = true;
            facing = Direction.RIGHT;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP){

            up = false;

        }

        if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN){

            down = false;

        }

        if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT){

            left = false;

        }

        if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT){

            right = false;

        }

    }
}
