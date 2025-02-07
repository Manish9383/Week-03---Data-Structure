package singly_linkedlist.inventory_management_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Management System:");
            System.out.println("1. Add Item at Beginning");
            System.out.println("2. Add Item at End");
            System.out.println("3. Remove Item");
            System.out.println("4. Update Quantity");
            System.out.println("5. Search Item by ID");
            System.out.println("6. Search Item by Name");
            System.out.println("7. Calculate Total Inventory Value");
            System.out.println("8. Sort Inventory by Name");
            System.out.println("9. Sort Inventory by Price");
            System.out.println("10. Display Inventory");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Item ID: ");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Item Name: ");
                    String name1 = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty1 = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price1 = scanner.nextDouble();
                    inventory.insertAtBeginning(id1, name1, qty1, price1);
                    break;

                case 2:
                    System.out.print("Enter Item ID: ");
                    int id2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Item Name: ");
                    String name2 = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty2 = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price2 = scanner.nextDouble();
                    inventory.insertAtEnd(id2, name2, qty2, price2);
                    break;

                case 3:
                    System.out.print("Enter Item ID to Remove: ");
                    int id3 = scanner.nextInt();
                    inventory.deleteItem(id3);
                    break;

                case 4:
                    System.out.print("Enter Item ID to Update Quantity: ");
                    int id4 = scanner.nextInt();
                    System.out.print("Enter New Quantity: ");
                    int newQty = scanner.nextInt();
                    inventory.updateQuantity(id4, newQty);
                    break;

                case 5:
                    System.out.print("Enter Item ID to Search: ");
                    int id5 = scanner.nextInt();
                    Item foundItem = inventory.searchByID(id5);
                    if (foundItem != null) foundItem.displayItem();
                    else System.out.println("Item not found.");
                    break;

                case 6:
                    System.out.print("Enter Item Name to Search: ");
                    scanner.nextLine();
                    String searchName = scanner.nextLine();
                    Item foundItemByName = inventory.searchByName(searchName);
                    if (foundItemByName != null) foundItemByName.displayItem();
                    else System.out.println("Item not found.");
                    break;

                case 7:
                    System.out.println("Total Inventory Value: $" + inventory.calculateTotalInventoryValue());
                    break;

                case 8:
                    inventory.sortByName();
                    break;

                case 9:
                    inventory.sortByPrice();
                    break;

                case 10:
                    inventory.displayInventory();
                    break;

                case 11:
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
