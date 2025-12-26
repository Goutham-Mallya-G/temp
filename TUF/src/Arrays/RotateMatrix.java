package Arrays;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void rotate(int[][] matrix) {
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j <= i; j++){
                swap(matrix , i , j);
            }
        }
        for(int i = 0 ; i < matrix.length ;i++){
            reverse(matrix[i]);
        }
    }
    private static void swap(int[][] matrix , int i , int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    private static void reverse(int[] matrix){
        int i = 0;
        int j = matrix.length-1;
        while(i <= j){
            int temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
    }
}
