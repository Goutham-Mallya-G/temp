package Greedy;

import java.util.ArrayList;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] val = new int[]{8, 2, 10, 1, 9, 7, 2, 6, 4, 9};
        int[] wt = new int[]{10, 1, 7, 7, 5, 1, 8, 6, 8, 7};
        int capacity = 21;
        System.out.println(fractionalKnapsack(val , wt , capacity));
    }
    public static double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        ArrayList<int[]> list = new ArrayList<>();
        for(int i = 0 ; i < val.length ; i++){
            list.add(new int[]{val[i] , wt[i]});
        }
        list.sort((a,b) -> {
            double x = (double) a[0]/a[1];
            double y = (double) b[0]/b[1];
            return Double.compare(y ,x);
        });
        double ans = 0;
        int cap = 0;
        for(int i = 0 ; i < list.size() ; i++){
            if(cap +list.get(i)[1] <= capacity){
                cap += list.get(i)[1];
                ans += list.get(i)[0];
            }else if(cap < capacity){
                int remain = capacity - cap;
                double mul = (double)list.get(i)[0] / list.get(i)[1];
                ans = ans + (remain * mul);
                cap += remain;
                break;
            }
        }
        return ans;
    }
}
