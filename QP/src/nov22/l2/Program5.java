package nov22.l2;

public class Program5 {
    static int mindis = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[][] mat = {{0,0,1,0,0}, {0,0,0,0,0}, {1,0,0,1,0} , {0,1,0,1,1} ,{0,0,0,0,0} };
        if(mat[0][0] == 1){
            System.out.println(-1);
            return;
        }
        solve(mat , 0 , 0 , 0);
        System.out.println(mindis);
    }
    private static void solve(int[][] mat , int i , int j , int dis){
        if(i < 0 || i >= mat.length || j < 0 || j >= mat[0].length){
            return;
        }
        if(i == mat.length-1 && j == mat[0].length-1){
            mindis = Math.min(mindis , dis);
            return;
        }

        mat[i][j] = 1;

        if(isValid(mat , i+1 , j)){
            solve(mat , i+1 , j , dis+1);
        }
        if(isValid(mat , i-1 , j)){
            solve(mat , i-1 , j , dis+1);
        }
        if(isValid(mat , i , j+1)){
            solve(mat , i , j+1 , dis+1);
        }
        if(isValid(mat , i , j-1)){
            solve(mat , i , j-1 , dis);
        }

        mat[i][j] = 0;

    }
    private static boolean isValid(int[][] mat , int i , int j){
        return(i >= 0 && i <mat.length && j>=0&& j<mat[0].length && mat[i][j] == 0);
    }
}
