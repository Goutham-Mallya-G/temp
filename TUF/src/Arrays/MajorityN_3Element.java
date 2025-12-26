package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityN_3Element {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,3};
        System.out.println(majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int need = nums.length/3;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num < min) min = num;
            if(num > max) max = num;
        }
        int[] freq = new int[max - min +1];
        for(int num : nums){
            freq[num-min]++;
        }
        for(int i = 0 ; i < freq.length ; i++)
            if(freq[i] > need){
                ans.add(i+min);
            }
        return ans;
    }
}
