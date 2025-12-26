package Arrays;

import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int k = 3;
        System.out.println(subarraySum(arr , k));
    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            int need = sum - k;
            if(map.containsKey(need)){
                ans += map.get(need);
            }
            map.put(sum, map.getOrDefault(sum , 0)+1);
        }
        return ans;
    }
}
