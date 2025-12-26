package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
    public static List<String> letterCombinations(String digits) {
        HashMap<Character ,String> map = new HashMap<>();
        map.put('2' , "abc");
        map.put('3' , "def");
        map.put('4' , "ghi");
        map.put('5' , "jkl");
        map.put('6' , "mno");
        map.put('7' , "pqrs");
        map.put('8' , "tuv");
        map.put('9' , "wxyz");
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        solve(digits , map , ans , sb , 0);
        return ans;
    }
    private static void solve(String digits , HashMap<Character , String> map , List<String> ans , StringBuilder sb , int ind){
        if(sb.length() == digits.length()){
            ans.add(sb.toString());
            return;
        }
        String letters = map.get(digits.charAt(ind));
        for(char letter : letters.toCharArray()){
            sb.append(letter);
            solve(digits , map , ans , sb , ind+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
