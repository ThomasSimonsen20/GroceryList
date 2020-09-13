package demo;

public class GroceryItemOrder implements Comparable<GroceryItemOrder>{

    private String itemName;
    private int pricePerUnit;
    private int quantity;

    public GroceryItemOrder(String itemName, int pricePerUnit, int quantity) {
        this.itemName = itemName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public int getSubTotal() {
        return pricePerUnit * quantity;
    }

    @Override
    public String toString() {
        return "itemName='" + itemName +
                ", pricePerUnit=" + pricePerUnit +
                ", quantity=" + quantity;
    }

    @Override
    public int compareTo(GroceryItemOrder groceryItemOrder) {
        return this.pricePerUnit - groceryItemOrder.pricePerUnit;
    }
}
