package nov22.l2;

public class Program1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int ans = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if(num < min) min = num;
            if(num > max) max = num;
        }
        int[] freq = new int[max - min+1];
        for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i] - min]++;
        }
        for(int i = freq.length-1 ; i>= 0 ; i--){
            if(i+min == freq[i]){
                ans = i+min;
                break;
            }
        }
        if(ans == Integer.MIN_VALUE){
            ans = -1;
        }
        System.out.println(ans);
    }
}