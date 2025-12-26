package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,1,1,0,1   };
        System.out.println(fun(arr));
    }
    private static int fun(int[] arr){
        int count = 0;
        int ans = 0;
        for(int num : arr){
            if(num == 1) {
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
