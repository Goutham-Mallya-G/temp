package Recursion;
import java.util.*;
public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(arr, target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans =  new ArrayList<>();
        List<Integer> collect = new ArrayList<>();
        solve(candidates , target , ans , collect , 0 , 0);
        return ans;
    }
    private static void solve(int[] candidates , int target , List<List<Integer>> ans , List<Integer> collect , int ind , int sum){
        if(sum > target|| ind == candidates.length){
            return;
        }
        if(sum == target ){
            ans.add(new ArrayList<>(collect));
            return;
        }
        if(sum < target){
            collect.add(candidates[ind]);
            solve(candidates , target , ans , collect , ind , sum+candidates[ind]);
            collect.remove(collect.size()-1);
        }
        solve(candidates , target , ans , collect , ind+1 , sum);
    }
}
