package sample_problems_for_stacks_and_queues.sort_a_stack_using_recursion;

import java.util.Stack;

public class SortStack {
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();

            sortStack(stack);
            insertInSortedOrder(stack, temp);
        }
    }

    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            int temp = stack.pop();

            insertInSortedOrder(stack, element);

            stack.push(temp);
        }
    }
}
