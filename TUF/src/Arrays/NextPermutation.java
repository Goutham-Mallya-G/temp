package Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,5};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void nextPermutation(int[] nums) {
        int ind = -1;
        for(int i = nums.length-1 ; i>0 ; i--){
            if(nums[i] > nums[i-1]){
                ind = i-1;
                break;
            }
        }
        if(ind == -1) {
            reverse(nums , 0);
            return;
        }
        for(int i = nums.length-1 ;i > ind ; i--){
            if(nums[i] > nums[ind]){
                swap(nums , i , ind);
                break;
            }
        }
        reverse(nums , ind+1);
        return;
    }
    private static void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] nums , int start){
        int end = nums.length-1;
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
