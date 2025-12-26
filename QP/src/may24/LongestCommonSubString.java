package may24;

public class LongestCommonSubString {
    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "ACDGHR";
        System.out.println(longestCommonSubstr(s1 , s2));
    }
    public static int longestCommonSubstr(String s1, String s2) {
        int ans = 0;
        for(int i = 0 ; i < s1.length() ; i++){
            for(int j = i ; j< s1.length() ; j++){
                if(s2.contains(s1.substring(i , j+1))){
                    ans = Math.max(ans , j-i+1);
                }
            }
        }
        return ans;
    }
}
