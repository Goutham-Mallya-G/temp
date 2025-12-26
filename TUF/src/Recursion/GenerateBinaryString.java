package Recursion;

import java.util.ArrayList;

public class GenerateBinaryString {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(binstr(n));
    }
    public static ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> list = new ArrayList<>();
        solve("" , n , list);
        return list;
    }
    private static void solve(String collect , int n , ArrayList<String> list){
        if(n == 0){
            list.add(collect);
            return;
        }
        solve(collect + '0' , n-1 , list);
        solve(collect + '1' , n-1 , list);
    }
}
