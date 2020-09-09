package demo;

/**
 * This class is for demonstration purpose: object references
 */
public class Controller {

    private GroceryItemOrder[] basket = new GroceryItemOrder[1];

    //hard coded basket with one item
    public void run() {
        GroceryItemOrder item = new GroceryItemOrder("Milk", 10, 1);
        basket[0] = item;

    }

    public GroceryItemOrder[] getBasket() {
        return basket;
    }
}
