package nov22.l2;

public class Program3 {
    public static void main(String[] args) {
        int[] current = new int[]{9,4,5,1,9};
        int[] target =  new int[]{8,9,9,9,9};
        int ans = 0;
        for(int i = 0 ; i < current.length ; i++){
            int a = current[i];
            int b = target[i];
            if(a > b){
                ans += Math.min((a - b) , ((b+10) - a));
            }else if(b > a) {
                ans += Math.min((b - a), ((a+ 10) - b));
            }
        }
        System.out.println(ans);
    }
}
