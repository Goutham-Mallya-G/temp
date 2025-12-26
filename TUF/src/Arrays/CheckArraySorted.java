package Arrays;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,1,2};
        System.out.println(fun(arr));
    }
    private static boolean fun(int[] arr){
        int count  = 0;
        if(arr[0] < arr[arr.length-1]){
            count++;
        }
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] < arr[i-1]){
                count++;
            }
        }
        return count < 2;
    }
}