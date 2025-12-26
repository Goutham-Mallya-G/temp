package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(generate(n));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1 ; i <= numRows ; i++){
            ans.add(new ArrayList<>(solve(i)));
        }
        return ans;
    }
    private static List<Integer> solve(int n){
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        int ans = 1;
        for(int i = 1 ; i <n ; i++){
            ans = ans * (n-i);
            ans = ans / i;
            temp.add(ans);
        }
        return temp;
    }
}
