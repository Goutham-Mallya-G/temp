package String;

public class RemoveOutermostParantheses {
    public static void main(String[] args) {
        String str = "(()())(())";
        System.out.println(removeOuterParentheses(str));
    }

    public static String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(count > 0){
                    str.append(ch);
                }
                count++;
            }else{
                if(count > 1){
                    str.append(ch);
                }
                count--;
            }
        }
        return str.toString();
    }
}
