package Arrays;

import java.util.Arrays;

public class LeftRotateArrayByK {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int n = 3;
        fun(arr , n);
        System.out.println(Arrays.toString(arr));
    }
    private static void fun(int[] arr , int n){
        n = n % arr.length;
        reverse(arr, 0 , arr.length-n-1);
        reverse(arr , arr.length - n , arr.length-1);
        reverse(arr , 0 , arr.length-1);
    }
    private static void reverse(int[] arr , int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
