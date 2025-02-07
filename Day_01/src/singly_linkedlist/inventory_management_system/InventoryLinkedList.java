package singly_linkedlist.inventory_management_system;

public class InventoryLinkedList {
    private Item head;

    public void insertAtBeginning(int itemID, String itemName, int quantity, double price) {
        Item newItem = new Item(itemID, itemName, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public void insertAtEnd(int itemID, String itemName, int quantity, double price) {
        Item newItem = new Item(itemID, itemName, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    public void deleteItem(int itemID) {
        if (head == null) return;
        if (head.itemID == itemID) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemID != itemID) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void updateQuantity(int itemID, int newQuantity) {
        Item item = searchByID(itemID);
        if (item != null) {
            item.quantity = newQuantity;
        }
    }

    public Item searchByID(int itemID) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemID == itemID) return temp;
            temp = temp.next;
        }
        return null;
    }

    public Item searchByName(String itemName) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(itemName)) return temp;
            temp = temp.next;
        }
        return null;
    }

    public double calculateTotalInventoryValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        return totalValue;
    }

    public void sortByName() {
        head = mergeSort(head, true);
    }

    public void sortByPrice() {
        head = mergeSort(head, false);
    }

    private Item mergeSort(Item head, boolean sortByName) {
        if (head == null || head.next == null) return head;

        Item middle = getMiddle(head);
        Item nextToMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(head, sortByName);
        Item right = mergeSort(nextToMiddle, sortByName);

        return merge(left, right, sortByName);
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Item merge(Item left, Item right, boolean sortByName) {
        if (left == null) return right;
        if (right == null) return left;

        if ((sortByName && left.itemName.compareToIgnoreCase(right.itemName) < 0) ||
                (!sortByName && left.price <= right.price)) {
            left.next = merge(left.next, right, sortByName);
            return left;
        } else {
            right.next = merge(left, right.next, sortByName);
            return right;
        }
    }

    public void displayInventory() {
        Item temp = head;
        while (temp != null) {
            temp.displayItem();
            temp = temp.next;
        }
    }
}
