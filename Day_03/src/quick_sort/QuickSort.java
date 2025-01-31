package quick_sort;
import java.util.*;
import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // Partition index

            quickSort(arr, low, pi);
            quickSort(arr, pi + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            do {
                i++;
            }while (i < high && arr[i] <= pivot);

            do {
                j--;
            } while (j > low && arr[j] > pivot);

            if (i < j) {
                Swap(arr, i, j);
            }
        }
        Swap(arr, low, j);
        return j;
    }

    private static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}