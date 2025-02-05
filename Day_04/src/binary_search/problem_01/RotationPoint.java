package binary_search.problem_01;

public class RotationPoint {
    public static int findIndex(int [] array){
        int n=array.length;
        int left=0,right=n-1;

        while(left<right){
            int mid=(left+right)/2;
            if(array[mid]>array[right]){
                left=mid+1;
            }else if(array[mid] < array[right]){
                right=mid;
            }
        }
        return left;
    }
}
