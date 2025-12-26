package Item.Projectiles;

import Player.Player;

import java.awt.*;

public class Projectile {

    private int x, y;
    private int speed = 10;
    private Player.Direction direction;
    private int duration = 30;
    private int size = 8;

    public Projectile(int projX, int projY, Player.Direction dir){

        x = projX;
        y = projY;
        direction = dir;

    }

    public void update(){

        switch(direction){

            case UP -> y -= speed;
            case RIGHT -> x += speed;
            case DOWN -> y += speed;
            case LEFT -> x -= speed;

        }

        duration--;

    }

    public boolean isDead(){

        return duration <= 0;

    }

    public void draw(Graphics2D g){

        g.setColor(Color.YELLOW);
        g.fillOval(x, y, size, size);

    }

    public Rectangle getHitBox(){

        return new Rectangle(x, y, size, size);

    }

    public int getX(){

        return x;

    }

    public int getY(){

        return y;

    }


}
