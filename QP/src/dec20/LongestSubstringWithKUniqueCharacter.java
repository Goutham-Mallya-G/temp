package dec20;

import java.util.HashSet;

public class LongestSubstringWithKUniqueCharacter {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestuniqueSubstring(s , k));
    }
//    private static int longestuniqueSubstring(String s , int k){
//        int ans = -1;
//        for(int i = 0; i < s.length() ; i++){
//            HashSet<Character>set = new HashSet<>();
//            for(int j = i ; j < s.length() ; j++){
//                if(set.size() == k+1 && set.contains(s.charAt(j))){
//                    break;
//                }else{
//                    set.add(s.charAt(j));
//                }
//                if(set.size()==k) {
//                    ans = Math.max(ans, j - i + 1);
//                }
//            }
//        }
//        return ans;
//    }
    private static int longestuniqueSubstring(String s , int k){
        int ans = -1;
        for(int i = 0 ; i < s.length() ; i++){
            int[] freq = new int[26];
            for(int j = i ; j < s.length() ; j++){
                if(uniqueCount(freq , k) > k){
                    break;
                }else{
                    freq[s.charAt(j) - 'a']++;
                }
                if(uniqueCount(freq , k) == k){
                    ans = Math.max(ans , j-i+1);
                }
            }
        }
        return ans;
    }
    private static int uniqueCount(int[] freq , int k){
        int limit = 0;
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] >= 1){
                limit++;
                if(limit > k){
                    return k+1;
                }
            }
        }
        return limit;
    }
}
