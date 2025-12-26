package may18._4;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr= new int[]{3,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        for(int num : nums){
            sum -= num;
        }
        return sum;
    }
}
