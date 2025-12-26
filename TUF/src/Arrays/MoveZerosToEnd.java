package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,3,12};
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void fun(int[] arr){
        int ind = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                arr[ind] = arr[i];
                ind++;
            }
        }
        for(int i = ind ; i < arr.length ; i++) {
            arr[i] = 0;
        }
    }
}
