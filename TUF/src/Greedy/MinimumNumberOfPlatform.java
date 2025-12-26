package Greedy;
import java.util.*;
public class MinimumNumberOfPlatform {
    public static void main(String[] args) {
        int[] arr = new int[]{900, 940, 950, 1100, 1500, 1800};
        int[] dep = new int[]{910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(minPlatform(arr , dep));
    }
    public static int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platform = 0;
        int ans = 0;
        int i = 0;
        int j = 0;
        while(i < arr.length){
            if(arr[i] <= dep[j]){
                platform++;
                i++;
            }else{
                platform--;
                j++;
            }
            ans = Math.max(ans , platform);
        }
        return ans;
    }
}
