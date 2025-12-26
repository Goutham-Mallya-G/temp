package Greedy;
import java.util.*;
public class JobSequencing {
    public static void main(String[] args) {
        int[] deadline = new int[]{4,1,1,1};
        int[] profit = new int[]{20,10,40,30};
        System.out.println(jobSequencing(deadline , profit));
    }
    public static ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        ArrayList<int[]> arrlist = new ArrayList<>();
        for(int i = 0 ; i < deadline.length ; i++){
            int[] arr = new int[]{deadline[i] , profit[i]};
            arrlist.add(arr);
        }
        arrlist.sort((a,b) -> b[1] - a[1]);
        int days = 0;
        for(int num : deadline){
            if(num > days) days = num;
        }
        int count = 0;
        int pro = 0;
        int[] progress = new int[days];
        for(int i = 0 ; i < arrlist.size() ; i++){
            for(int j = arrlist.get(i)[0] ; j > 0 ; j--){
                if(progress[j-1] == 0){
                    progress[j-1] = arrlist.get(i)[1];
                    count++;
                    pro += arrlist.get(i)[1];
                    break;
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(count);
        ans.add(pro);
        return ans;
    }
}
