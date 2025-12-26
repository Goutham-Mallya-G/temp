package String;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        HashMap<Character , Integer> hash = new HashMap<>();
        hash.put('I' , 1);
        hash.put('V' , 5);
        hash.put('X' , 10);
        hash.put('L' , 50);
        hash.put('C' , 100);
        hash.put('D' , 500);
        hash.put('M' , 1000);
        int ans = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if( i+1 < s.length() && hash.get(s.charAt(i)) < hash.get(s.charAt(i+1))){
                ans += hash.get(s.charAt(i+1)) - hash.get(s.charAt(i));
                i++;
            }else {
                ans += hash.get(s.charAt(i));
            }
        }
        return ans;
    }
}
