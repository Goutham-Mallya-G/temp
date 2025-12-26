package dec17_OnCampus;

public class ArratFrequency {
    public static void main(String[] args) {
        int[] arr = new int[]{5,5,5,5};
        findFreq(arr);
    }
    private static void findFreq(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > max) max = num;
            if(num < min) min = num;
        }
        int[] freq = new int[max - min +1];
        for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i] - min]++;
        }
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] != 0){
                System.out.println(i+min + " -> " + freq[i]);
            }
        }
    }
}
