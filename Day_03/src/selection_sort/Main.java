package selection_sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 25, 34, 22, 67};

        SelectionSort sorter = new SelectionSort();

        System.out.println("Original Exam scores:");
        sorter.printArray(arr);

        sorter.selectionSort(arr);

        System.out.println("Exam scores after sorting:");
        sorter.printArray(arr);
    }
}
