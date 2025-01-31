package sample_problems_for_stacks_and_queues.sort_a_stack_using_recursion;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        SortStack.sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
