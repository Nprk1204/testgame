package Item;

import java.awt.*;

public class Item {

    private int x, y, width, height;
    private int quantity, maxQuantity;

    private boolean isCollected;

    private String type;
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

    public String getType(){

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

    public void setType(String newType){

        type = newType;

    }

    public void setMaxQuantityByType(String type){

        if (type.equalsIgnoreCase("Misc")){

            maxQuantity = 5;

        }

        if (type.equalsIgnoreCase("Materials")){

            maxQuantity = 100;

        }

        if (type.equalsIgnoreCase("Ammo")){

            maxQuantity = 50;

        }

        if (type.equalsIgnoreCase("Weapon")){

            maxQuantity = 1;

        }

    }

    public void setCollected(boolean newIsCollected){

        isCollected = newIsCollected;

    }

    public void draw(Graphics2D g){



    }

}
