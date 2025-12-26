package Arrays;

public class MajorityN_2Element {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int ele = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(count == 0){
                ele = nums[i];
            }
            if(ele == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return ele;
    }
}
