package may18._4;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String str ="babad";
        System.out.println(longestPalindrome(str));
    }
    private static int[][] dp;
    public static String longestPalindrome(String s) {
        dp = new int[s.length()][s.length()];
        int max = 1;
        int start = 0;

        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){
                if(solve(i , j , s) && j-i+1 > max){
                    max = j-i+1;
                    start = i;
                }
            }
        }
        return s.substring(start , start+max);
    }
    private static boolean solve(int i , int j , String s){
        if(i >= j) return true;

        if(dp[i][j] != 0){
            return dp[i][j] == 1;
        }

        if(s.charAt(i) == s.charAt(j)){
            dp[i][j] = solve(i+1, j-1 , s) ? 1 : -1;
        }else{
            dp[i][j] = -1;
        }

        return dp[i][j] == 1;

    }
}
