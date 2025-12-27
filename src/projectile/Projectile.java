package projectile;

import player.Player;

import java.awt.*;

public class Projectile {

    private int x, y, width, height;
    private int speed;
    private int duration;
    private Player.Direction direction;
    private boolean isDead;

    public Projectile(int x, int y, Player.Direction dir){

        this.x = x;
        this.y = y;
        this.direction = dir;
        this.width = 10;
        this.height = 10;
        this.speed = 20;
        this.duration = 30;

    }

    public void update(){

        switch(direction){

            case UP:
                y -= speed;
                duration --;
                break;
            case DOWN:
                y += speed;
                duration --;
                break;
            case LEFT:
                x -= speed;
                duration --;
                break;
            case RIGHT:
                x += speed;
                duration --;
                break;

        }

    }

    public void draw(Graphics2D g){

        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);

    }

    public boolean isDead(){

        return duration <= 0;

    }

}
