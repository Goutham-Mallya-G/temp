package Recursion;

import java.util.ArrayList;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3};
        System.out.println(subsetSums(arr));
    }
    public static ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        solve(arr , 0 , ans , 0);
        return ans;
    }
    private static void solve(int[] arr, int ind, ArrayList<Integer> ans , int sum){
        if(ind == arr.length){
            ans.add(sum);
            return;
        }
        solve(arr , ind+1 , ans , sum+arr[ind]);
        solve(arr , ind+1 , ans , sum);
    }
}
