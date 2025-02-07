package circular_linked.undo_redo;

public class DoublyLinkedList {
    private Node currentState;
    private Node head;
    private Node tail;
    private int size;
    private final int maxHistorySize;

    public DoublyLinkedList(int maxHistorySize) {
        this.maxHistorySize = maxHistorySize;
        head = tail = currentState = null;
        size = 0;
    }

    public void addTextState(String text) {
        TextState newTextState = new TextState(text);
        Node newNode = new Node(newTextState);

        if (size == maxHistorySize) {
            removeOldestState();
        }

        if (currentState == null) {
            head = tail = currentState = newNode;
        } else {
            currentState.next = newNode;
            newNode.prev = currentState;
            currentState = newNode;
            tail = currentState;
        }

        size++;
    }

    private void removeOldestState() {
        if (head != null) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public String undo() {
        if (currentState == null || currentState.prev == null) {
            return "No previous state to undo.";
        }
        currentState = currentState.prev;
        return currentState.textState.getText();
    }

    public String redo() {
        if (currentState == null || currentState.next == null) {
            return "No next state to redo.";
        }
        currentState = currentState.next;
        return currentState.textState.getText();
    }

    public void displayCurrentState() {
        if (currentState == null) {
            System.out.println("No text available.");
        } else {
            System.out.println("Current State: " + currentState.textState.getText());
        }
    }

    private class Node {
        TextState textState;
        Node next;
        Node prev;

        Node(TextState textState) {
            this.textState = textState;
            this.next = this.prev = null;
        }
    }
}
