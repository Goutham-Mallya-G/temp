package Greedy;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,0,1,1};
        System.out.println(canJump(arr));
    }
    public static boolean canJump(int[] nums) {
        int min = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i > min)return false;
            int can = i + nums[i];
            if(can > min) min = can;
        }
        return min >= nums.length-1;
    }
}
