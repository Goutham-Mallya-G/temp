package may18._3;

import java.util.Arrays;

public class rotateArrayBuKElements {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr , k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums , 0 , nums.length-k-1);
        reverse(nums , nums.length-k , nums.length-1);
        reverse(nums , 0 , nums.length-1);
    }
    private static void reverse(int[] nums, int i , int j){
        while(i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
