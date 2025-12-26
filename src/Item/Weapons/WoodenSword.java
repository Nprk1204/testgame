package Item.Weapons;

import java.awt.*;

public class WoodenSword extends Weapons{

    public WoodenSword(int itemX, int itemY, int itemWidth, int itemHeight) {

        super(itemX, itemY, itemWidth, itemHeight);

        setName("Wooden Sword");
        setType("Weapon");
        setDamage(5);
        setDurability(50);
        setMaxDurability(50);
        setMaxQuantityByType(getType());

    }

    public void draw(Graphics2D g){

        g.setColor(Color.ORANGE);
        g.fillRect(getX(), getY(), getWidth(), getHeight());

    }

}
