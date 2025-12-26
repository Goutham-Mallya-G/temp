package may18._4;

import java.util.Arrays;

public class LowestNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{3,30,34,5,9};
        System.out.println(lowest(arr));
    }
    private static String lowest(int[] arr){
        String[] nums = new String[arr.length];
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(nums , (a,b) -> (a+b).compareTo(b+a));

        StringBuilder ans = new StringBuilder();
        for(int i =0 ; i < nums.length ; i++){
            ans.append(nums[i]);
        }
        return ans.toString();
    }
}
