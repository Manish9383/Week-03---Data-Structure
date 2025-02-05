package linear_search;

public class FirstNegativeNumber {
    public static int Negative(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                return i;
            }
        }
       return -1;
    }
    public static void main(String[] args) {
        int[] arr= {2,4,6,-3,1,4};
        int result =FirstNegativeNumber.Negative(arr);
        System.out.println(result);
    }

}
