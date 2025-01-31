package counting_sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {18, 22, 20, 19, 23, 20, 19};

        CountingSort sorter = new CountingSort();

        System.out.println("Original ages of students is :");
        sorter.printArray(arr);

        sorter.countingSort(arr);

        System.out.println("Sorted ages of the students are:");
        sorter.printArray(arr);
    }
}
