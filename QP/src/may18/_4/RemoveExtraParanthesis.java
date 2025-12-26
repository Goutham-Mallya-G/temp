package may18._4;

public class RemoveExtraParanthesis {
    public static void main(String[] args) {
        String str = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(str));
    }
    public static String minRemoveToMakeValid(String s) {
        int open = 0;
        StringBuilder opensb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                opensb.append('(');
                open++;
            }else if(s.charAt(i) == ')'){
                if(open > 0){
                    opensb.append(')');
                    open--;
                }
            }else{
                opensb.append(s.charAt(i));
            }
        }
        int close = 0;
        StringBuilder closesb = new StringBuilder();
        for(int i = opensb.length()-1 ; i>=0 ; i--){
            if(opensb.charAt(i) == ')'){
                closesb.append(')');
                close++;
            }else if(opensb.charAt(i) == '('){
                if(close > 0){
                    closesb.append('(');
                    close--;
                }
            }
            else{
                closesb.append(opensb.charAt(i));
            }
        }
        return closesb.reverse().toString();
    }
}
