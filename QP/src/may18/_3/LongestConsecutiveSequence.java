package may18._3;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int ans = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int count = 1;
                int n = num;
                while(set.contains(n+1)){
                    count++;
                    n++;
                }
                if(count > ans){
                    ans = count;
                }
            }
        }
        return ans;
    }
}
