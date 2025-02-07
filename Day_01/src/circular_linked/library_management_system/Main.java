package circular_linked.library_management_system;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList library = new DoublyLinkedList();

        Book book1 = new Book("Harry Potter", "J.K. Rowling", "Fantasy", 101, true);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 102, false);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 103, true);

        library.addBookAtEnd(book1);
        library.addBookAtEnd(book2);
        library.addBookAtEnd(book3);

        library.displayAllBooksForward();
        System.out.println("Total Books: " + library.countTotalBooks());

        library.searchBookByTitleOrAuthor("J.K. Rowling");
        library.updateBookAvailability(102, true);
        library.displayAllBooksReverse();

        library.removeBookById(101);
        library.displayAllBooksForward();
    }
}
