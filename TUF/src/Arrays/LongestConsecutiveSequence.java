package Arrays;

import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                int count = 1;
                int x = num;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                ans = Math.max(count , ans);
            }
        }
        return ans;
    }
}
