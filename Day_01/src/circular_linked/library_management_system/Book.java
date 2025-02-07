package circular_linked.library_management_system;

public class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;

    public Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
    }
}
