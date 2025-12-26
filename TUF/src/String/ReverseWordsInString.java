package String;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "EPY2giL";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        s.trim();
        int i = s.length()-1;
        int j = s.length()-1;
        StringBuilder ans = new StringBuilder();
        while(j >= 0){
            while( j>= 0 && Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            ans.append(s.substring(j+1 , i+1) + " ");
            i = j;
            while(i>= 0 && Character.isWhitespace(s.charAt(i))){
                i--;
            }
            j=i;
        }
        return ans.toString().trim();
    }
}
