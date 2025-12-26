package Arrays;

import java.util.Arrays;

public class RearrangeArrayInAlternativeSign {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int[] ans = new int[nums.length];
        for(int num : nums){
            if(num < 0){
                ans[neg] = num;
                neg +=2;
            }else{
                ans[pos] = num;
                pos+=2;
            }
        }
        return ans;
    }
}
