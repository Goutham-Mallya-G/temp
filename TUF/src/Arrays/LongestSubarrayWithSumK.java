package Arrays;

import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums = new int[]{10, 5, 2, 7, 1, -10};
        System.out.println(longestSubarray(nums , 15));

    }
    public static int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0 , 1);
        int sum = 0;
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            int need = sum - k;
            if(hash.containsKey(need)){
                hash.put(sum , i);
                ans = Math.max(ans , i + hash.get(need));
            }else{
                hash.put(sum , i);
            }
        }
        return ans;
    }
}
