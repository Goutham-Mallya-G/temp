package String;

public class StringToIntegerAtoi {
    public static void main(String[] args) {
        String s = "1337c0d3";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        s = s.trim();
        int sign = 1;
        int ind = 0;
        if(s.length() == 0) return 0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            if(s.charAt(0) == '-'){
                sign = -1;
            }
            ind++;
        }
        long num = 0;
        for(int i = ind ; i < s.length() ; i++){
            if(Character.isDigit(s.charAt(i))){
                num = num * 10 + (int)(s.charAt(i) - '0');
                if(num * sign > Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }else if(num * sign < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }else{
                break;
            }
        }
        return sign * (int)num;
    }
}
