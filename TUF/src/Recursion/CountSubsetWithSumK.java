package Recursion;

public class CountSubsetWithSumK {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,4,5};
        int target = 5;
        System.out.println(count(arr , target));
    }
    private static int count(int[] arr, int target){
        return solve(arr , target , 0 , 0);
    }
    private static int solve(int[] arr , int target , int ind , int sum){
        if(ind == arr.length){
            if(sum == target){
                return 1;
            }else {
                return 0;
            }
        }
        int left = solve(arr, target , ind+1 , sum + arr[ind]);
        int right = solve(arr , target , ind+1 , sum );

        return left + right;
    }
}
