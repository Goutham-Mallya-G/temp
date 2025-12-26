package jun01._1;

public class CountPalindromeSubstring {
    public static void main(String[] args) {
        String str = "aaa";
        System.out.println((countSubstrings(str)));
    }
    private static int[][] dp;
    public static int countSubstrings(String s) {
        int count= 0;
        dp = new int[s.length()][s.length()];
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){
                if(isPalindrome(s , i , j)){
                    count++;
                }
            }
        }
        return count;
    }
    private static boolean isPalindrome(String s , int i , int j){
        if(i >= j) return true;

        if(dp[i][j] !=0){
            return dp[i][j] == 1;
        }

        if(s.charAt(i) == s.charAt(j) && isPalindrome(s,i+1,j-1)){
            dp[i][j] = 1;
        }else{
            dp[i][j] = -1;
        }

        return dp[i][j] ==1;
    }
}
