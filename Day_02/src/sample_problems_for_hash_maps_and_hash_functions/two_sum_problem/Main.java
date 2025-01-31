package sample_problems_for_hash_maps_and_hash_functions.two_sum_problem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();

        int[] nums = {2, 8, 11, 7};
        int target = 9;

        int[] result = ts.findTwoSum(nums, target);

        if (result.length > 0) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
}
