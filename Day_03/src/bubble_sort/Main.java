package bubble_sort;
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] marks = {50, 70, 29, 32, 90};
        BubbleSort.Sort(marks);
        System.out.println("Sorted Marks is :" + Arrays.toString(marks));
    }
}