package singly_linkedlist.social_media;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSocial Media Friend Connections:");
            System.out.println("1. Add User");
            System.out.println("2. Add Friend Connection");
            System.out.println("3. Remove Friend Connection");
            System.out.println("4. Display Friends of a User");
            System.out.println("5. Find Mutual Friends");
            System.out.println("6. Search User by ID");
            System.out.println("7. Search User by Name");
            System.out.println("8. Count Friends of a User");
            System.out.println("9. Display All Users");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int userID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    network.addUser(userID, name, age);
                    break;

                case 2:
                    System.out.print("Enter First User ID: ");
                    int id1 = scanner.nextInt();
                    System.out.print("Enter Second User ID: ");
                    int id2 = scanner.nextInt();
                    network.addFriendConnection(id1, id2);
                    break;

                case 3:
                    System.out.print("Enter First User ID: ");
                    int remove1 = scanner.nextInt();
                    System.out.print("Enter Second User ID: ");
                    int remove2 = scanner.nextInt();
                    network.removeFriendConnection(remove1, remove2);
                    break;

                case 4:
                    System.out.print("Enter User ID to Display Friends: ");
                    int displayID = scanner.nextInt();
                    network.displayFriends(displayID);
                    break;

                case 5:
                    System.out.print("Enter First User ID: ");
                    int mutual1 = scanner.nextInt();
                    System.out.print("Enter Second User ID: ");
                    int mutual2 = scanner.nextInt();
                    network.findMutualFriends(mutual1, mutual2);
                    break;

                case 6:
                    System.out.print("Enter User ID to Search: ");
                    int searchID = scanner.nextInt();
                    User foundUser = network.searchByID(searchID);
                    if (foundUser != null) foundUser.displayUser();
                    else System.out.println("User not found.");
                    break;

                case 7:
                    System.out.print("Enter User Name to Search: ");
                    scanner.nextLine();
                    String searchName = scanner.nextLine();
                    User foundUserByName = network.searchByName(searchName);
                    if (foundUserByName != null) foundUserByName.displayUser();
                    else System.out.println("User not found.");
                    break;

                case 8:
                    System.out.print("Enter User ID to Count Friends: ");
                    int countID = scanner.nextInt();
                    network.countFriends(countID);
                    break;

                case 9:
                    network.displayUsers();
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
