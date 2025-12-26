package Greedy;

import java.util.*;
public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(arr));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , (a,b)-> a[0] - b[0]);
        int l = 0;
        int[] curr = intervals[0];
        for(int i = 1 ; i < intervals.length ; i++){
            if(intervals[i][0] < curr[1]){
                l++;
            }else{
                curr = intervals[i];
            }
        }
        int r = 0;
        curr = intervals[intervals.length-1];
        for(int i = intervals.length-2 ; i >= 0 ; i--){
            if(intervals[i][1] > curr[0]){
                r++;
            }else{
                curr = intervals[i];
            }
        }
        return Math.min(l , r);
    }
}
