package Greedy;

import java.util.ArrayList;

public class NMeetingInOneRoon {
    public static void main(String[] args) {
        int[] start = new int[]{1, 3, 0, 5, 8, 5};
        int[] end = new int[]{2, 4, 6, 7, 9, 9};
        System.out.println(maxMeetings(start , end));
    }
    public static int maxMeetings(int start[], int end[]) {
        // add your code here
        ArrayList<int[]> arrlist = new ArrayList<>();
        for(int i=  0 ; i < start.length ; i++){
            int[] arr = new int[]{start[i], end[i]};
            arrlist.add(arr);
        }
        arrlist.sort((a,b) -> a[1] - b[1]);
        int ans = 1;
        int endTime = arrlist.get(0)[1];
        for(int i = 1 ; i < arrlist.size() ; i++){
            if(endTime < arrlist.get(i)[0]){
                ans++;
                endTime = arrlist.get(i)[1];
            }
        }
        return ans;
    }
}
