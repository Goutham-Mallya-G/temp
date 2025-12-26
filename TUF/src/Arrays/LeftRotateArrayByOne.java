package Arrays;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void rotate(int[] arr){
        int temp = arr[0];
        for(int i = 0 ; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
}
