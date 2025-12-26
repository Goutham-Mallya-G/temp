package String;

public class CountAndSay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }
    public static String countAndSay(int n) {
        String num = "1";
        StringBuilder sb = new StringBuilder();
        while(n!=1){
            sb = new StringBuilder();
            for(int i = 0 ; i < num.length() ; i++){
                int count = 1;
                while(i+1 != num.length() && num.charAt(i) == num.charAt(i+1)){
                    count++;
                    i++;
                }

                sb.append(String.valueOf(count));
                sb.append(num.charAt(i));
            }
            num = sb.toString();
            n--;
        }
        return num;
    }
}
