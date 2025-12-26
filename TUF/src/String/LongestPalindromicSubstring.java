package String;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "abbcccba";
        System.out.println(longestPalindrome(s));
    }
    static int[][] dp;
    public static String longestPalindrome(String s) {
        dp = new int[s.length()][s.length()];
        int ans = 0;
        String result = "";
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j< s.length() ; j++){
                if(isPalindrome(s , i , j) && j-i+1 > ans){
                    ans = j-i+1;
                    result = s.substring(i , j+1);
                }
            }
        }
        return result;
    }
    private static boolean isPalindrome(String s , int i , int j){
        if(i >= j) return true;

        if(dp[i][j] != 0){
            return dp[i][j] == 1;
        }

        if(s.charAt(i) == s.charAt(j)){
            dp[i][j] = isPalindrome(s , i+1 , j-1) ? 1 : -1;
        }else{
            dp[i][j] = -1;
        }

        return dp[i][j] == 1;

    }
}
