package Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{4,1,2,1,2};
        System.out.println(check(arr));
    }
    private static int check(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        int[] freq = new int[max - min + 1];
        for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i]-min]++;
        }
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] == 1){
                return i+min;
            }
        }
        return -1;
    }
}