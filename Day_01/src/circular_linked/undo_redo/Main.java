package circular_linked.undo_redo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList textHistory = new DoublyLinkedList(10);

        boolean running = true;
        while (running) {
            System.out.println("\nText Editor - Choose an option:");
            System.out.println("1. Type text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display current text");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    String text = scanner.nextLine();
                    textHistory.addTextState(text);
                    break;

                case 2:
                    System.out.println("Undo: " + textHistory.undo());
                    break;

                case 3:
                    System.out.println("Redo: " + textHistory.redo());
                    break;

                case 4:
                    textHistory.displayCurrentState();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting text editor...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
