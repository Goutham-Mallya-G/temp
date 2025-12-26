package jun01._2;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr , target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        int sum = 0;
        int[] ans = new int[2];
        for(int i = 0 ; i < nums.length ; i++){
            int need = target - nums[i];
            if(map.containsKey(need)){
                ans[0] = map.get(need);
                ans[1] = i;
                return ans;
            }else{
                map.put(nums[i] , i);
            }
        }
        return new int[]{-1,-1};
    }
}
