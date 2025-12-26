package Greedy;

public class Candy {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,2};
        System.out.println(candy(arr));
    }
    public static int candy(int[] ratings) {
        int sum = 1;
        int i = 1, n = ratings.length;
        while(i < n){
            if(ratings[i] == ratings[i-1]){
                sum++;
                i++;
                continue;
            }
            int peak = 1;
            while(i < n && ratings[i] > ratings[i-1]){
                peak++;
                i++;
                sum+=peak;
            }
            int down = 1;
            while(i < n && ratings[i] < ratings[i-1]){
                sum+= down;
                down++;
                i++;
            }
            if(down > peak){
                sum+= (down - peak);
            }
        }
        return sum;
    }
}
