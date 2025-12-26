package String;

public class RepeatedStringMatch {
    public static void main(String[] args) {
        String a = "abc";
        String b = "cabcabca";
        System.out.println(repeatedStringMatch(a,b));

    }
    public static int repeatedStringMatch(String a, String b) {
        int num = 1;
        int len = b.length();
        String add = a;
        for(int i = 0; i < len ;i++){
            if(a.contains(b))return num;
            a += add;
            num++;
        }
        if(a.contains(b))return num;
        return -1;
    }
}
