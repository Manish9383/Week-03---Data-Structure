package circular_linked.library_management_system;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = tail = null;
    }

    public void addBookAtEnd(Book book) {
        Node newNode = new Node(book);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addBookAtStart(Book book) {
        Node newNode = new Node(book);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addBookAtPosition(Book book, int position) {
        if (position == 1) {
            addBookAtStart(book);
            return;
        }

        Node newNode = new Node(book);
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of the bounds.");
            return;
        }

        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void removeBookById(int bookId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.book.bookId == bookId) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }
                System.out.println("Book with ID " + bookId + " removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    public void searchBookByTitleOrAuthor(String searchTerm) {
        if (head == null) {
            System.out.println("No books available.");
            return;
        }
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.book.title.equalsIgnoreCase(searchTerm) || temp.book.author.equalsIgnoreCase(searchTerm)) {
                System.out.println("Found Book - Title: " + temp.book.title + ", Author: " + temp.book.author +
                        ", Genre: " + temp.book.genre + ", Book ID: " + temp.book.bookId +
                        ", Available: " + (temp.book.isAvailable ? "Yes" : "No"));
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No books found with the given title or author.");
        }
    }

    public void updateBookAvailability(int bookId, boolean isAvailable) {
        Node temp = head;
        while (temp != null) {
            if (temp.book.bookId == bookId) {
                temp.book.isAvailable = isAvailable;
                System.out.println("Book availability updated. ID: " + bookId + " is now " + (isAvailable ? "Available" : "Not Available"));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    public void displayAllBooksForward() {
        if (head == null) {
            System.out.println("No books available.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.book.title + ", Author: " + temp.book.author + ", Genre: " + temp.book.genre +
                    ", Book ID: " + temp.book.bookId + ", Available: " + (temp.book.isAvailable ? "Yes" : "No"));
            temp = temp.next;
        }
    }

    public void displayAllBooksReverse() {
        if (tail == null) {
            System.out.println("No books available.");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.println("Title: " + temp.book.title + ", Author: " + temp.book.author + ", Genre: " + temp.book.genre +
                    ", Book ID: " + temp.book.bookId + ", Available: " + (temp.book.isAvailable ? "Yes" : "No"));
            temp = temp.prev;
        }
    }

    public int countTotalBooks() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private class Node {
        Book book;
        Node next;
        Node prev;

        Node(Book book) {
            this.book = book;
            this.next = null;
            this.prev = null;
        }
    }
}
