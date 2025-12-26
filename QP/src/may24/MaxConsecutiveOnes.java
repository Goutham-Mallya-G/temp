package may24;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                count++;
            }else{
                ans = Math.max(ans , count);
                count = 0;
            }
        }
        ans = Math.max(ans , count);
        return ans;
    }
}
