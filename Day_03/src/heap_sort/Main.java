package heap_sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12000, 11000, 13000, 5000, 60000, 68777};

        HeapSort sorter = new HeapSort();

        System.out.println("Job applicants salary before sorting :");
        sorter.printArray(arr);

        sorter.heapSort(arr);

        System.out.println("Job applicants salary after sorting :");
        sorter.printArray(arr);
    }
}
