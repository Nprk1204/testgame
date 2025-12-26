package Inventory;

import Item.Item;

import java.util.ArrayList;

public class Inventory {

    private int x, y;
    private boolean containsItem;

    private ArrayList<Item> inventory;

    public Inventory(){

        inventory = new ArrayList<>();

    }

    public boolean containsItem(Item item){

        for (Item items : inventory){

            if (item.getName().equalsIgnoreCase(items.getName())){

                return containsItem = true;

            }

        }

        return false;
    }

    public void addItem(Item item){

        for (Item invItem : inventory){

            if (invItem.getName().equals(item.getName())){

                if (invItem.getQuantity() < invItem.getMaxQuantity()){

                    invItem.increaseQuantity(1);
                    return;

                }

            }

        }

        inventory.add(item);
        System.out.println(item.getName() + " has been added to your inventory");

    }

    public void removeItem(Item item){



    }

    public void showItems(){

        for (int i = 0; i < inventory.size(); i++){

            System.out.println((i + 1) + ": " + inventory.get(i).getName() + " x" + inventory.get(i).getQuantity());

        }

    }

}
