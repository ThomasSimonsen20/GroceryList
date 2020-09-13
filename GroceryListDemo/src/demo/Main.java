package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The solution uses Main class as Controller for the application
 */
public class Main {

    public static void main(String[] args) throws BasketFullException {

        GroceryList groceryList = new GroceryList();
	    GroceryItemOrder item1 = new GroceryItemOrder("Pineapple", 20, 1);
        GroceryItemOrder item2 = new GroceryItemOrder("Apple", 4, 10);
        groceryList.add(item1);
        groceryList.add(item2);
        // test what happens if adding too many items
        //groceryList.add(new GroceryItemOrder("Banana", 5, 2));


        int total = groceryList.getCost();
        System.out.println("*********** Grocery List **********");
        System.out.println(groceryList);
        System.out.println("Total cost " + total);

        // Convert the array to List
        List<GroceryItemOrder> arrayAsList = Arrays.asList(groceryList.getList());
        Collections.sort(arrayAsList);
        System.out.println("*********** Sorted Grocery List (sorted by unit price) **********");
        System.out.println("sorted");
        System.out.println(arrayAsList);

    }
}
