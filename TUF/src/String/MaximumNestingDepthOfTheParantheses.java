package String;

public class MaximumNestingDepthOfTheParantheses {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
    public static int maxDepth(String s) {
        int count = 0;
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                count++;
            }else if(ch == ')'){
                count--;
            }
            ans = Math.max(ans , count);
        }
        return ans;
    }
}
