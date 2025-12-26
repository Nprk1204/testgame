package Item.Weapons;

import Item.Item;

public class Weapons extends Item {

    private int damage;
    private int durability;
    private int maxDurability;

    public Weapons(int itemX, int itemY, int itemWidth, int itemHeight) {

        super(itemX, itemY, itemWidth, itemHeight);

    }

    public int getDamage(){

        return damage;

    }

    public int getDurability(){

        return durability;

    }

    public int getMaxDurability(){

        return maxDurability;

    }

    public void setDamage(int newDamage){

        damage = newDamage;

    }

    public void setDurability(int newDurability){

        durability = newDurability;

    }

    public void setMaxDurability(int newMaxDurability){

        maxDurability = newMaxDurability;

    }
}
