package Item.Misc;

import Item.Item;

import java.awt.*;

public class Coin extends Item {



    public Coin(int itemX, int itemY, int itemWidth, int itemHeight) {

        super(itemX, itemY, itemWidth, itemHeight);

        setName("Coin");
        setType(ItemType.MISC);
        setMaxQuantityByType(getType());

    }

    public void draw(Graphics2D g){

        g.setColor(Color.YELLOW);
        g.fillOval(getX(), getY(), getWidth(), getHeight());

    }

}

