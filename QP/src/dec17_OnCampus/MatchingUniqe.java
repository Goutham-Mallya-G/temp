package dec17_OnCampus;

public class MatchingUniqe {
    public static void main(String[] args) {
        int n = 121;
        int[] arr = new int[]{3, 44, 555, 6789};
        System.out.println(match(n , arr));
    }
    private static int match(int n , int[] arr){
        int ans = 0;
        int need = findUnique(n);
        for(int i = 0 ; i < arr.length ; i++){
            if(findUnique(arr[i]) == need){
                ans++;
            }
        }
        return ans;
    }
    private static int findUnique(int n){
        int[] freq = new int[10];
        while(n > 0) {
            freq[n % 10]++;
            n/=10;
        }
        int count = 0;
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] >= 1){
                count++;
            }
        }
        return count;
    }
}
