package double_linkedlist.undo_redo;

public class History {
    private Node head, tail, current;
    private int size;
    private static final int MAX_HISTORY = 10;

    public History() {
        head = tail = current = null;
        size = 0;
    }

    public void addState(String text) {
        Node newNode = new Node(text);
        if (size == MAX_HISTORY) {
            head = head.next;
            size--;
        }
        if (size == 0) {
            head = tail = current = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            current = tail;
        }
        size++;
    }

    public String undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            return current.text;
        }
        return null;
    }

    public String redo() {
        if (current != null && current.next != null) {
            current = current.next;
            return current.text;
        }
        return null;
    }

    public String getCurrentState() {
        return current != null ? current.text : null;
    }

    private class Node {
        String text;
        Node next, prev;

        Node(String text) {
            this.text = text;
            this.next = this.prev = null;
        }
    }
}
