package sample_problems_for_hash_maps_and_hash_functions.check_for_a_pair_with_given_sum_in_an_array;

import java.util.HashMap;

public class PairChecker {
    public static boolean hasPairWithSum(int[] arr, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;
            if (numMap.containsKey(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }
            numMap.put(num,1);
        }
        return false;
    }
}

