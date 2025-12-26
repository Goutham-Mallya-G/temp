package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(sum(arr , target)));
    }
    private static int[] sum(int[] arr , int target){
        int[] ans = new int[2];
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int need = target - arr[i];
            if(map.containsKey(need)){
                ans[0] = map.get(need);
                ans[1] = i;
                return ans;
            }else{
                map.put(arr[i] , i);
            }
        }
        return new int[]{-1,-1};
    }
}
