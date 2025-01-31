package sample_problems_for_hash_maps_and_hash_functions.find_all_subarrays_with_zero_sum;


import java.util.*;

public class ZeroSumSubarraysMain {
    public static void main(String[] args) {
        int[] arr = {6, -1, 3, -3, 4, -2, 2, -3};

        List<int[]> zeroSumSubarrays = ZeroSumSubarrays.findZeroSumSubarrays(arr);

        if (zeroSumSubarrays.isEmpty()) {
            System.out.println("No zero sum subarrays found.");
        } else {
            System.out.println("Subarrays with zero sum:");
            for (int[] subarray : zeroSumSubarrays) {
                System.out.println(Arrays.toString(subarray));
            }
        }
    }
}
