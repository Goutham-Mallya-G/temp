package Arrays;

public class BestTimeToBuyStocks {
    public static void main(String[] args) {
        int[] arr = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int ans = 0;
        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else{
                int profit = prices[i] - buy;
                ans = Math.max(ans , profit);
            }
        }
        return ans;
    }
}
