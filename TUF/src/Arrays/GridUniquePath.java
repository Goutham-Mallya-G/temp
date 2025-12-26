package Arrays;

import java.util.*;
public class GridUniquePath {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(uniquePaths(m , n));
    }
    private static int[][] dp;
    public static int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int i = 0 ; i < dp.length ; i++){
            Arrays.fill(dp[i] , -1);
        }
        return solve(0 , 0  , m , n);
    }
    private static int solve(int i , int j , int m , int n){
        if(i >= m || j >= n) return 0;

        if(i == m-1 && j == n-1) return 1;

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int down = solve(i+1 , j , m , n);
        int right = solve(i , j+1 , m , n);

        return dp[i][j] = down+right;
    }
}
