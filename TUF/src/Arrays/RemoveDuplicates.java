package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr= new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(fun(arr)));
    }
    private static int[] fun(int[] arr){
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        int ind = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(ans[ind] != arr[i]){
                ans[++ind] = arr[i];
            }
        }
        return ans;
    }
}
