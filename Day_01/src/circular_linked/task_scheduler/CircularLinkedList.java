package circular_linked.task_scheduler;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        head = tail = null;
    }

    public void addTaskAtEnd(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void addTaskAtStart(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void addTaskAtPosition(Task task, int position) {
        if (position == 1) {
            addTaskAtStart(task);
            return;
        }

        Node newNode = new Node(task);
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        Node prev = null;
        do {
            if (temp.task.taskId == taskId) {
                if (prev == null) {
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                    if (temp == tail) {
                        tail = prev;
                    }
                }
                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Task not found.");
    }

    public void viewCurrentTask() {
        if (head != null) {
            System.out.println("Current Task: " + head.task.taskName);
        } else {
            System.out.println("No tasks available.");
        }
    }

    public void moveToNextTask() {
        if (head != null) {
            head = head.next;
            viewCurrentTask();
        } else {
            System.out.println("No tasks available.");
        }
    }

    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Node temp = head;
        do {
            System.out.println("Task ID: " + temp.task.taskId + ", Name: " + temp.task.taskName + ", Priority: " + temp.task.priority + ", Due Date: " + temp.task.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchTaskByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Node temp = head;
        boolean found = false;
        do {
            if (temp.task.priority == priority) {
                System.out.println("Task ID: " + temp.task.taskId + ", Name: " + temp.task.taskName + ", Due Date: " + temp.task.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No tasks found with the given priority.");
        }
    }

    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }
}
