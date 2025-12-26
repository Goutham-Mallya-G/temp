package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class SubsetsII {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2};
        subsetsWithDup(arr);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> collect = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums , ans , collect , 0);
        return ans;
    }
    private static void solve(int[] nums , List<List<Integer>> ans , List<Integer> collect , int ind){
        ans.add(new ArrayList<>(collect));
        for(int i = ind ; i < nums.length ; i++){
            if(i > ind && nums[i] == nums[i-1])continue;
            collect.add(nums[i]);
            solve(nums , ans, collect , i+1);
            collect.remove(collect.size()-1);
        }
    }
}
