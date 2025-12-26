package jun01._1;

import java.util.Stack;

public class DeleteAndUndoString {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "#", "b", "*"};
        System.out.println(fun(arr));
    }
    private static String fun(String[] arr){
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(String ch : arr){
            if(Character.isLetter(ch.charAt(0))){
                sb.append(ch);
            }
            else if(ch.equals("#")){
                if(sb.length() > 0) {
                    st.add(sb.charAt(sb.length() - 1));
                    sb.deleteCharAt(sb.length() - 1);
                }
            }else if(ch.equals("*")){
                if(st.size()>0) {
                    sb.append(st.pop());
                }
            }
        }
        return sb.toString();
    }
}
