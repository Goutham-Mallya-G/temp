package Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : nums){
            sum+= num;
            ans = Math.max(ans , sum);
            if(sum < 0) sum =0;
        }
        return ans;
    }
}
