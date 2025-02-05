package binary_search.problem_01;
public class Main {
    public static void main(String[] args) {
        int [] array={7,8,9,1,2,3,4};
        int index=RotationPoint.findIndex(array);
        System.out.println("Index of the smallest element in the array is :"+index);
    }
}
