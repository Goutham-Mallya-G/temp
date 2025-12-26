package String;

public class SumOfBeautyOfAllString {
    public static void main(String[] args) {
        String str = "aabcb";
        System.out.println(beautySum(str));
    }
    public static int beautySum(String s) {
        int ans = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int[] freq = new int[26];
            for(int j = i ; j <s.length() ; j++){
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                int val = 0;
                freq[s.charAt(j) - 'a']++;
                for(int l =0 ; l <freq.length ; l++){
                    if (freq[l] > 0 && freq[l] < min) {
                        min = freq[l];
                    }
                    if(freq[l] > max){
                        max = freq[l];
                    }
                }
                if(min != Integer.MAX_VALUE && max != Integer.MIN_VALUE){
                    val = max - min;
                    ans += val;
                }
            }
        }
        return ans;
    }
}
