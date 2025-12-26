package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
        int k = 3;
        int n = 7;
        System.out.println(combinationSum3(k , n));
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> collect = new ArrayList<>();
        solve(k , n , ans , collect , 1 , 0);
        return ans;
    }
    private static void solve(int k , int n , List<List<Integer>> ans , List<Integer> collect , int val , int sum){
        if(sum == n && collect.size() == k){
            ans.add(new ArrayList<>(collect));
            return;
        }
        for(int i = val ; i <= 9 ; i++){
            if(sum > n)break;
            collect.add(i);
            solve(k , n , ans , collect , i+1 , sum+i);
            collect.remove(collect.size()-1);
        }
    }

}
