package demo;

public class GroceryItemOrder {

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
}
