package may18._1;

public class decodeString {
    public static void main(String[] args) {
        String s = "13a3b";
        System.out.println(decode(s));
    }
    private static String decode(String s){
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                int num = ch-'0';
                count = count * 10 + num;
            }else{
                while(count != 0){
                    ans.append(ch);
                    count--;
                }
            }
        }
        return ans.toString();
    }
}
