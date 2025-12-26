package may18._2;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s = "aabaab!bb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while(j < s.length()){
            while(sb.indexOf(""+(s.charAt(j))) != -1){
                i++;
                sb = new StringBuilder(s.substring(i , j));
            }
            sb = new StringBuilder(s.substring(i , j+1));
            j++;
            if(sb.length() > ans){
                ans = sb.length();
            }
        }
        return ans;
    }
}
