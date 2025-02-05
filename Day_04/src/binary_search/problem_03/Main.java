package binary_search.problem_03;


public class Main {
    public static void main(String[] args) {
        int[][] matrix2 = {
                {2, 4, 6, 8},
                {12, 14, 18, 22},
                {25, 28, 32, 35}
        };

        int target = 14;
        System.out.println("Is value "+target+" in 2D Matrix "+TargetValue.searchMatrix(matrix2, target));

        target = 27;
        System.out.println("Is value "+target+" in 2D Matrix "+TargetValue.searchMatrix(matrix2, target));
    }
}
