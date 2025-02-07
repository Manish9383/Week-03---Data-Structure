package singly_linkedlist.inventory_management_system;

public class Item {
    String itemName;
    int itemID;
    int quantity;
    double price;
    Item next;

    public Item(int itemID, String itemName, int quantity, double price) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }

    public void displayItem() {
        System.out.println("ID: " + itemID + ", Name: " + itemName + ", Quantity: " + quantity + ", Price: " + price);
    }
}
