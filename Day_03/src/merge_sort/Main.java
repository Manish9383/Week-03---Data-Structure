package merge_sort;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {583, 345, 800, 442, 200};
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted price of books are : "+Arrays.toString(arr));
    }
}


