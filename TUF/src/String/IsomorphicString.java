package String;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s , t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freqS = new int[256];
        int[] freqT = new int[256];
        for(int i = 0 ; i < s.length() ; i++){
            if(freqS[s.charAt(i)] == 0 && freqT[t.charAt(i)] == 0){
                freqS[s.charAt(i)] = t.charAt(i);
                freqT[t.charAt(i)] = s.charAt(i);
            }else if(freqS[s.charAt(i)] != t.charAt(i) || freqT[t.charAt(i)] != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
