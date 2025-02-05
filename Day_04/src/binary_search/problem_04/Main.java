package binary_search.problem_04;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int first=FindFirstOccurrence.findFirst(nums,target);
        int last= FindLastOccurrences.findLast(nums,target);
        System.out.println("First occurrence of "+target+" in array is at index :"+first);
        System.out.println("Last occurrence of "+target+" in array is at index :"+last);

    }
}
