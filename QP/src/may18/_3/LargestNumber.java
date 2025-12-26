package may18._3;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{3,30,34,5,9};
        System.out.println(largest(nums));
    }
    private static String largest(int[] nums){
        String[] strNum = new String[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            strNum[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strNum , (a,b) -> {
            return (b+a).compareTo(a+b);
        });
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < strNum.length ; i++){
            ans.append(strNum[i]);
        }
        if(ans.charAt(0) == '0') return "0";
        return ans.toString();
    }
}
