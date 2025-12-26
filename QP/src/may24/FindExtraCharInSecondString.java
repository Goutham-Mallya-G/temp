package may24;

public class FindExtraCharInSecondString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abcd";
        System.out.println(extraChar(s1 , s2));
    }
    public static char extraChar(String s1, String s2) {
        int[] freq = new int[26];
        for(char ch : s2.toCharArray()){
            freq[ch -'a']++;
        }
        for(char ch : s1.toCharArray()){
            freq[ch - 'a']--;
        }
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] != 0){
                return (char)(i + 'a');
            }
        }
        return 'a';
    }
}
