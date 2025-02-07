package double_linkedlist.library_management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book at Beginning");
            System.out.println("2. Add Book at End");
            System.out.println("3. Remove Book by Book ID");
            System.out.println("4. Search Book by Title");
            System.out.println("5. Search Book by Author");
            System.out.println("6. Update Book Availability");
            System.out.println("7. Display All Books (Forward)");
            System.out.println("8. Display All Books (Reverse)");
            System.out.println("9. Count Total Books");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Title: ");
                    String title1 = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author1 = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre1 = scanner.nextLine();
                    System.out.print("Enter Book ID: ");
                    int bookID1 = scanner.nextInt();
                    System.out.print("Is Available (true/false): ");
                    boolean isAvailable1 = scanner.nextBoolean();
                    library.addBookAtBeginning(title1, author1, genre1, bookID1, isAvailable1);
                    break;

                case 2:
                    System.out.print("Enter Title: ");
                    String title2 = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author2 = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre2 = scanner.nextLine();
                    System.out.print("Enter Book ID: ");
                    int bookID2 = scanner.nextInt();
                    System.out.print("Is Available (true/false): ");
                    boolean isAvailable2 = scanner.nextBoolean();
                    library.addBookAtEnd(title2, author2, genre2, bookID2, isAvailable2);
                    break;

                case 3:
                    System.out.print("Enter Book ID to Remove: ");
                    int removeID = scanner.nextInt();
                    library.removeBookByID(removeID);
                    break;

                case 4:
                    System.out.print("Enter Book Title: ");
                    String searchTitle = scanner.nextLine();
                    library.searchByTitle(searchTitle);
                    break;

                case 5:
                    System.out.print("Enter Author Name: ");
                    String searchAuthor = scanner.nextLine();
                    library.searchByAuthor(searchAuthor);
                    break;

                case 6:
                    System.out.print("Enter Book ID to Update Availability: ");
                    int updateID = scanner.nextInt();
                    System.out.print("Enter New Availability (true/false): ");
                    boolean newAvailability = scanner.nextBoolean();
                    library.updateAvailability(updateID, newAvailability);
                    break;

                case 7:
                    library.displayBooksForward();
                    break;

                case 8:
                    library.displayBooksReverse();
                    break;

                case 9:
                    library.countTotalBooks();
                    break;

                case 10:
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
