package jun01._2;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        System.out.println(findMedianSortedArrays(nums1 , nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int ind = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                arr[ind++] = nums1[i++];
            }else{
                arr[ind++] = nums2[j++];
            }
        }
        while(i < nums1.length){
            arr[ind++] = nums1[i++];
        }
        while(j < nums2.length){
            arr[ind++] = nums2[j++];
        }
        if(arr.length % 2 != 0){
            return arr[arr.length / 2];
        }else{
            return (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
        }
    }
}
