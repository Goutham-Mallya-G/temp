package may18._1;

public class MaximumNumberOfMergeIntervals {
    public static void main(String[] args) {
        int[][]arr = new int[][]{{1, 2}, {2, 4}, {3, 6}};
        System.out.println(overlapInt(arr));
    }
    public static int overlapInt(int[][] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i][0] > max) max = arr[i][0];
            if(arr[i][1] > max) max = arr[i][1];
            if(arr[i][0] < min) min = arr[i][0];
            if(arr[i][1] < min) min = arr[i][1];
        }
        int[] freq = new int[max - min + 1];
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = arr[i][0] ; j <= arr[i][1] ; j++){
                freq[j - min]++;
            }
        }
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] > ans) ans = freq[i];
        }
        return ans;
    }
}
