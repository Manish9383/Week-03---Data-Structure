package sample_problems_for_hash_maps_and_hash_functions.find_all_subarrays_with_zero_sum;

import java.util.*;

public class ZeroSumSubarrays {

    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();

        Map<Integer, List<Integer>> sumMap = new HashMap<>();

        sumMap.put(0, new ArrayList<>(Arrays.asList(-1)));

        int cumulativeSum = 0;
        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];

            if (sumMap.containsKey(cumulativeSum)) {
                List<Integer> indices = sumMap.get(cumulativeSum);

                for (int index : indices) {
                    result.add(Arrays.copyOfRange(arr, index + 1, i + 1));
                }
            }

            sumMap.computeIfAbsent(cumulativeSum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }
}
