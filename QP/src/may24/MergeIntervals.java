package may24;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int[][] ans = merge(arr);
        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(Arrays.toString(ans[i]));
        }
    }
    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals , (a,b) -> a[0] - b[0]);
        int[] curr = intervals[0];
        for(int i = 1 ; i < intervals.length ; i++){
            if(intervals[i][0] <= curr[1]){
                curr[1] = Math.max(curr[1] , intervals[i][1]);
            }else{
                ans.add(curr);
                curr = intervals[i];
            }
        }
        ans.add(curr);
        int[][] result = new int[ans.size()][];
        for(int i = 0 ; i < result.length ; i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}
