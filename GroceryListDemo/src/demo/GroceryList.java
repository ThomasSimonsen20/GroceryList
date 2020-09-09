package demo;

import java.util.Arrays;

public class GroceryList {
    private GroceryItemOrder[] list = new GroceryItemOrder[2];
    private int counter = 0;

    public void add(GroceryItemOrder o) throws BasketFullException {
        if (listNotFull()) {
            list[counter++] = o;
        }
        else throw new BasketFullException("Maximum number of items reached!");
    }

    private boolean listNotFull() {
        return counter <= list.length;
    }
    
    public int getCost() {
        int totalCost = 0;
        for (int i = 0; i < list.length; i++) {
            totalCost += list[i].getSubTotal();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }

    //demo
    public void add(GroceryItemOrder[] list) {
        this.list = list;
    }
}
