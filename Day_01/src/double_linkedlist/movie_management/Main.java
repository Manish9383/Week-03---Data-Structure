package double_linkedlist.movie_management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieList movieList = new MovieList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMovie Management System:");
            System.out.println("1. Add Movie at Beginning");
            System.out.println("2. Add Movie at End");
            System.out.println("3. Remove Movie by Title");
            System.out.println("4. Search Movie by Director");
            System.out.println("5. Search Movie by Rating");
            System.out.println("6. Update Movie Rating");
            System.out.println("7. Display All Movies (Forward)");
            System.out.println("8. Display All Movies (Reverse)");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Title: ");
                    String title1 = scanner.nextLine();
                    System.out.print("Enter Director: ");
                    String director1 = scanner.nextLine();
                    System.out.print("Enter Year of Release: ");
                    int year1 = scanner.nextInt();
                    System.out.print("Enter Rating: ");
                    double rating1 = scanner.nextDouble();
                    movieList.addMovieAtBeginning(title1, director1, year1, rating1);
                    break;

                case 2:
                    System.out.print("Enter Title: ");
                    String title2 = scanner.nextLine();
                    System.out.print("Enter Director: ");
                    String director2 = scanner.nextLine();
                    System.out.print("Enter Year of Release: ");
                    int year2 = scanner.nextInt();
                    System.out.print("Enter Rating: ");
                    double rating2 = scanner.nextDouble();
                    movieList.addMovieAtEnd(title2, director2, year2, rating2);
                    break;

                case 3:
                    System.out.print("Enter Movie Title to Remove: ");
                    String removeTitle = scanner.nextLine();
                    movieList.removeMovieByTitle(removeTitle);
                    break;

                case 4:
                    System.out.print("Enter Director's Name: ");
                    String searchDirector = scanner.nextLine();
                    movieList.searchByDirector(searchDirector);
                    break;

                case 5:
                    System.out.print("Enter Rating to Search: ");
                    double searchRating = scanner.nextDouble();
                    movieList.searchByRating(searchRating);
                    break;

                case 6:
                    System.out.print("Enter Movie Title to Update Rating: ");
                    String updateTitle = scanner.nextLine();
                    System.out.print("Enter New Rating: ");
                    double newRating = scanner.nextDouble();
                    movieList.updateMovieRating(updateTitle, newRating);
                    break;

                case 7:
                    movieList.displayMoviesForward();
                    break;

                case 8:
                    movieList.displayMoviesReverse();
                    break;

                case 9:
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
