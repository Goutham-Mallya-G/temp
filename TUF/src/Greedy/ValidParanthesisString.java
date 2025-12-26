package Greedy;

import javax.swing.*;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class ValidParanthesisString {
    public static void main(String[] args) {
        String s = "(*))";
        System.out.println(checkValidString(s));
    }
    public static boolean checkValidString(String s) {
        int min = 0;
        int max = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                min++;
                max++;
            }else if(s.charAt(i) == ')'){
                max--;
                min--;
            }else{
                max++;
                min--;
            }
            if(min < 0){
                min = 0;
            }
            if(max < 0){
                return false;
            }
        }
        return min == 0;
    }
}
