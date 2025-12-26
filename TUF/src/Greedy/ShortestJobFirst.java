package Greedy;
import java.util.*;
public class ShortestJobFirst {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,7,1,2};
        System.out.println(solve(arr));
    }
    private static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int t = 0;
        int wt = 0;
        for(int i = 0 ; i < bt.length ; i++){
            wt += t;
            t += bt[i];
        }
        return wt / bt.length;
    }
}
