package jun01._1;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int ans = 0;
        StringBuilder sb = new StringBuilder();
        while(j < s.length()){
            while(j < s.length() && sb.indexOf(""+s.charAt(j)) == -1){
                sb.append(s.charAt(j));
                ans = Math.max(ans , j-i+1);
                j++;
            }
            i++;
            String str = s.substring(i , j);
            sb = new StringBuilder(str);
        }
        return ans;
    }
}
