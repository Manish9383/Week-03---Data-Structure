package circular_linked.task_scheduler;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList taskList = new CircularLinkedList();

        Task task1 = new Task(1, "Task 1", 3, "2025-01-30");
        Task task2 = new Task(2, "Task 2", 1, "2025-02-05");
        Task task3 = new Task(3, "Task 3", 2, "2025-01-28");

        taskList.addTaskAtEnd(task1);
        taskList.addTaskAtEnd(task2);
        taskList.addTaskAtEnd(task3);

        taskList.displayAllTasks();

        taskList.viewCurrentTask();
        taskList.moveToNextTask();
        taskList.moveToNextTask();

        taskList.removeTaskById(2);
        taskList.displayAllTasks();

        taskList.searchTaskByPriority(3);
    }
}
