package demo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws BasketFullException {

        GroceryList groceryList = new GroceryList();
	    GroceryItemOrder item1 = new GroceryItemOrder("Apple", 4, 10);
        GroceryItemOrder item2 = new GroceryItemOrder("Pineapple", 20, 1);
        groceryList.add(item1); //put break point here
        groceryList.add(item2);
        // test what happens if adding too many items
        // groceryList.add(new GroceryItemOrder("Banana", 5, 2));


        int total = groceryList.getCost();
        System.out.println("*********** Grocery list **********");
        System.out.println(groceryList);
        System.out.println("Total cost " + total);

        /*
      // demo
        Controller webshop = new Controller();
        webshop.run();
        GroceryItemOrder[] basket = webshop.getBasket();

        System.out.println();
        System.out.println("***** Demo af Controller object's basket *****");
        System.out.println(Arrays.toString(basket));

        System.out.println();
        System.out.println("***** Demo af Grocery list *****");
        groceryList.add(basket);
        System.out.println(groceryList);
        */
    }
}
