package double_linkedlist.library_management;

public class Library {
    private Book head;
    private Book tail;
    private int totalBooks;

    public void addBookAtBeginning(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        totalBooks++;
    }

    public void addBookAtEnd(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        totalBooks++;
    }

    public void removeBookByID(int bookID) {
        Book current = head;
        while (current != null) {
            if (current.bookID == bookID) {
                if (current == head && current == tail) {
                    head = tail = null;
                } else if (current == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                totalBooks--;
                System.out.println("Book with ID " + bookID + " removed.");
                return;
            }
            current = current.next;
        }
        System.out.println("Book not found.");
    }

    public void searchByTitle(String title) {
        Book current = head;
        boolean found = false;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.displayBook();
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No book found with title: " + title);
    }

    public void searchByAuthor(String author) {
        Book current = head;
        boolean found = false;
        while (current != null) {
            if (current.author.equalsIgnoreCase(author)) {
                current.displayBook();
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No books found by author: " + author);
    }

    public void updateAvailability(int bookID, boolean newStatus) {
        Book current = head;
        while (current != null) {
            if (current.bookID == bookID) {
                current.isAvailable = newStatus;
                System.out.println("Updated availability of book ID " + bookID + " to " + (newStatus ? "Available" : "Not Available"));
                return;
            }
            current = current.next;
        }
        System.out.println("Book not found.");
    }

    public void displayBooksForward() {
        Book current = head;
        System.out.println("\nBooks (Forward Order):");
        while (current != null) {
            current.displayBook();
            current = current.next;
        }
    }

    public void displayBooksReverse() {
        Book current = tail;
        System.out.println("\nBooks (Reverse Order):");
        while (current != null) {
            current.displayBook();
            current = current.prev;
        }
    }

    public void countTotalBooks() {
        System.out.println("\nTotal Books in Library: " + totalBooks);
    }
}
