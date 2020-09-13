package demo;

import java.util.Arrays;

public class GroceryList {

    // For test purpose, the array can only hold two items
    private GroceryItemOrder[] list = new GroceryItemOrder[2];
    private int counter = 0;

    public void add(GroceryItemOrder itemOrder) throws BasketFullException {
        if (listNotFull()) {
            list[counter++] = itemOrder;
        }
        else throw new BasketFullException("Maximum number of items reached!");
    }

    private boolean listNotFull() {
        return counter < list.length;
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

    public GroceryItemOrder[] getList() {
        return list;
    }
}
