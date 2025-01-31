package sample_problems_for_stacks_and_queues.implement_a_queue_using_stacks;

// Driver Code
class Main {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}