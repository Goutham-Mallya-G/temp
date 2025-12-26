package Arrays;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));
    }
    private static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int high = arr[arr.length-1];
        ans.add(high);
        for(int i = arr.length-2 ; i>=0 ; i--){
            if(arr[i] >= high){
                ans.add(0, arr[i]);
                high = arr[i];
            }
        }
        return ans;
    }
}
