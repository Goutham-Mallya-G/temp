package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;
        merge(nums1, m , nums2 , n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        int i = m-1;
        int j = n-1;
        int ind = nums1.length-1;
        while(j>=0){
            if(i >= 0 && nums2[j] < nums1[i]){
                nums1[ind--] = nums1[i];
                i--;
            }else{
                nums1[ind--] = nums2[j];
                j--;
            }
        }
    }
}
