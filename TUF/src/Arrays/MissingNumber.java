package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr= new int[]{3,0,1};
        System.out.println(fun(arr));
    }
    private static int fun(int[] arr){
        int n = arr.length;
        int sum = n * (n+1) / 2;
        for(int num : arr){
            sum -= num;
        }
        return sum;
    }
}
