package may18._1;

import java.util.Arrays;

public class SortBasedOnSquare {
    public static void main(String[] args) {
        int[] arr = new int[]{-6, -3, -1, 2, 4, 5};
        Integer[] nums = new Integer[arr.length];
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = arr[i];
        }
        Arrays.sort(nums , (a,b) -> a*a - b*b);
        System.out.println(Arrays.toString(nums));
    }
}
