package jun01._2;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(set.add(n)){
            int sum = 0;
            while(n > 0){
                sum += (n % 10)*(n % 10);
                n /= 10;
            }
            if(sum == 1) return true;
            n = sum;
        }
        return false;
    }
    public static boolean isSad(int n) {
        Set<Integer> set = new HashSet<>();
        while(set.add(n)){
            int sum = 0;
            while(n > 0){
                sum += (n % 10)*(n % 10);
                n /= 10;
            }
            n = sum;
            if(set.contains(n)) return  true;
        }
        return false;
    }
}
