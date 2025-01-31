package sample_problems_for_stacks_and_queues.sliding_window_maximum;

public class Main {
    public static void main(String[] args) {
        SlidingWindowMax swm = new SlidingWindowMax();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = swm.maxSlidingWindow(nums, k);

        for (int max : result) {
            System.out.print(max + " ");
        }
    }
}
