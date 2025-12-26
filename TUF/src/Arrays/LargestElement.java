package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,11,2,3,1};
        System.out.println(largest(arr));
    }
    private static int largest(int[] arr) {
        int ans = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > ans) {
                ans = num;
            }
        }
        return ans;
    }
}
