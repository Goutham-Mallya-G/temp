package Recursion;

public class CheckSubsetWithSumK {
    public static void main(String[] args) {
        int[] arr = new int[]{10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(checkSubsequenceSum(arr, target));
    }
    public static boolean checkSubsequenceSum(int[] arr, int K) {
        return solve(arr , K , 0 , 0);
    }
    private static boolean solve(int[] arr ,int K , int ind , int sum){
        if(sum > K)return false;
        if(ind == arr.length){
            if(sum == K){
                return true;
            }else{
                return false;
            }
        }
        if(solve(arr , K , ind+1 , sum+arr[ind]))return true;
        if(solve(arr , K , ind+1 ,sum))return true;
        return false;
    }
}
