package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(find(arr , 3));
    }
    private static int find(int[] arr ,int n){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }

}
