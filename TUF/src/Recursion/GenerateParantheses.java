package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("" , n*2 , ans , 0 , 0);
        return ans;
    }
    private static void solve(String collect , int n , List<String> ans , int open , int close){
        if(collect.length() == n){
            ans.add(collect);
            return;
        }
        if(open < n/2){
            solve(collect + "(" , n , ans , open+1 , close);
        }
        if(close < open) {
            solve(collect + ")", n , ans, open, close + 1);
        }
    }
}
