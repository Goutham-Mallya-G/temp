package Greedy;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        int n = 39;
        System.out.println(findMin(n));
    }
    public static int findMin(int n) {
        // code here
        int ans =0;
        while(n >= 10){
            n -= 10;
            ans++;
        }
        if(n == 0)return ans;
        while(n >= 5){
            n-= 5;
            ans++;
        }
        if(n == 0) return ans;
        while(n >= 2){
            n -= 2;
            ans++;
        }
        if(n == 0) return ans;
        while(n >= 1){
            n -=1;
            ans++;
        }
        return ans;
    }
}
