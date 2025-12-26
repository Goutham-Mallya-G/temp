package nov22.l2;

public class Program2 {
    public static void main(String[] args) {
        String name  = "abcabc";
        String typed = "abcabbbbccaa";
        boolean ans = fun(name , typed);
        System.out.println(ans);
    }
    private static boolean fun(String name , String typed){
        int i = 0;
        int j = 0;
        while(i < name.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else if(i > 0 && typed.charAt(j) == name.charAt(i-1)){
                j++;
            }else{
                return false;
            }
            if(i >= name.length()){
                return true;
            }
            if(j >= typed.length()){
                return false;
            }
        }
        return true;
    }
}
