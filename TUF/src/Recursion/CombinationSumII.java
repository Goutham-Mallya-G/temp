package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class CombinationSumII {
    public static void main(String[] args) {
        int[] arr = new int[]{10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum2(arr , target));
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates , target , ans , temp , 0 , 0);
        return ans;
    }
    private static void solve(int[] candidates , int target , List<List<Integer>> ans , List<Integer> temp , int ind , int sum){
        if(sum == target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = ind ; i < candidates.length ; i++){
            if(i > ind && candidates[i] == candidates[i-1])continue;
            if(sum > target)break;
            temp.add(candidates[i]);
            solve(candidates , target , ans , temp , i+1 , sum+candidates[i]);
            temp.remove(temp.size()-1);
        }
    }

}

