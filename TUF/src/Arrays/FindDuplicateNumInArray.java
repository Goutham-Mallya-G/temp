package Arrays;

public class FindDuplicateNumInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > max) max = num;
        }
        int[] freq = new int[max+1];
        for(int num : nums){
            freq[num]++;
        }
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] > 1){
                return i;
            }
        }
        return -1;
    }
}
