package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 7, 7, 5};
        fun(arr);
    }
    private static void fun(int[] arr){
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                secLargest = largest;
                largest = num;
            }else if( num < largest && num > secLargest){
                secLargest = num;
            }
        }
        System.out.println("Second largest element " + secLargest);
    }
}
