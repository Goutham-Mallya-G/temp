package nov22.l2;

import java.util.Arrays;

public class Program4 {
    public static void main(String[] args) {
        int[] arr = new int[]{6,4,7,13,4,6,4,4,13,4,6};
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
        int[] ans = new int[arr.length];
        int highfreq = -1;
        int del = -1;
        int ind = 0;
        while(highfreq != 0){
            for(int i = 0 ; i < freq.length ; i++) {
                if (freq[i] > highfreq) {
                    highfreq = freq[i];
                    del = i + min;
                }
            }
            for(int i = 0 ; i < highfreq ; i++){
                ans[ind++] = del;
            }
            freq[del-min] = 0;
            if(highfreq != 0) {
                highfreq = -1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
