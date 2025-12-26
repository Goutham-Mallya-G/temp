package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(subsets(arr));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> collect = new ArrayList<>();
        solve(nums , 0 , collect , ans);
        return ans;
    }
    private static void solve(int[] nums , int ind , List<Integer> collect , List<List<Integer>> ans){
        if(ind == nums.length){
            ans.add(new ArrayList<>(collect));
            return;
        }
        collect.add(nums[ind]);
        solve(nums , ind+1 , collect , ans);
        collect.remove(collect.size()-1);
        solve(nums , ind+1 , collect , ans);
    }
}
