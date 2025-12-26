package may24;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0};
        System.out.println(dominantIndex(arr));
    }
    public static int dominantIndex(int[] nums) {
        int large = nums[0];
        int ind = 0;
        int secLarge = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > large){
                secLarge = large;
                large = nums[i];
                ind = i;
            }else if(nums[i] < large && nums[i] > secLarge){
                secLarge= nums[i];
            }
        }
        if(large >= secLarge*2){
            return ind;
        }
        return -1;
    }
}
