package Item;

import java.awt.*;

public class Item {

    private int x, y, width, height;
    private int quantity, maxQuantity;

    private boolean isCollected;

    private ItemType type;
    private String name;

    public Item(int itemX, int itemY, int itemWidth, int itemHeight){

        x = itemX;
        y = itemY;
        width = itemWidth;
        height = itemHeight;
        isCollected = false;
        quantity = 1;

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

    public boolean getIsCollected(){

        return isCollected;

    }

    public ItemType getType(){

        return type;

    }

    public int getQuantity(){

        return quantity;

    }

    public int getMaxQuantity(){

        return maxQuantity;

    }

    public String getName(){

        return name;

    }

    public void setName(String newName){

        name = newName;

    }

    public void increaseQuantity(int amount){

        quantity += amount;

    }

    public void setType(ItemType newItemType){

        type = newItemType;

    }

    public enum ItemType{

        MISC,
        MATERIALS,
        AMMO,
        WEAPON

    }

    public void setMaxQuantityByType(ItemType type){

        switch (type){

            case AMMO -> maxQuantity = 50;
            case MISC -> maxQuantity = 5;
            case MATERIALS -> maxQuantity = 100;
            case WEAPON -> maxQuantity = 1;

        }

    }

    public void setCollected(boolean newIsCollected){

        isCollected = newIsCollected;

    }

    public void draw(Graphics2D g){



    }

}
