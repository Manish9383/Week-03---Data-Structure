package sample_problems_for_hash_maps_and_hash_functions.check_for_a_pair_with_given_sum_in_an_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        if (!PairChecker.hasPairWithSum(arr, target)) {
            System.out.println("No pair found.");
        }

        scanner.close();
    }
}
