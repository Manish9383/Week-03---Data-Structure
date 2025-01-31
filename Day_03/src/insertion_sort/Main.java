package insertion_sort;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] id = {101, 103, 108, 104, 106};
        InsertionSort.insertionSort(id);
        System.out.println("Sorted Id's are :"+Arrays.toString(id));
    }
}
