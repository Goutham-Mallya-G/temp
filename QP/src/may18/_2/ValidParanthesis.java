package may18._2;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str = "{}[]";
        System.out.println(isValid(str));
    }
    private static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '(' || ch == '{' || ch =='['){
                st.push(ch);
            }else{
                if(ch == ')'){
                    if(st.isEmpty() || st.pop() != '(') return false;
                }
                if(ch == ']'){
                    if(st.isEmpty() || st.pop() != '[') return false;
                }
                if(ch == '}'){
                    if(st.isEmpty() || st.pop() != '{') return false;
                }
            }
        }
        return st.isEmpty();
    }
}
