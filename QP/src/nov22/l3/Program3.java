package nov22.l3;

import java.util.Arrays;
import java.util.Comparator;

public class Program3 {
    public static void main(String[] args) {
        int[] nums = {1,2,121};
        System.out.println(lowestNumber(nums));
    }

    public static String lowestNumber(int[] nums) {
        String[] s_nums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s_nums[i] = String.valueOf(nums[i]);
        }

        Comparator<String> comp = (a, b) -> (a + b).compareTo(b + a);
        Arrays.sort(s_nums, comp);


        StringBuilder sb = new StringBuilder();
        for (String s : s_nums) {
            sb.append(s);
        }

        return sb.toString();
    }
}
