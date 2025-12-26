package Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,3}};
        System.out.println(searchMatrix(arr , 3));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0 ; i < matrix.length ; i++){
            int low = matrix[i][0];
            int high = matrix[i][matrix[0].length-1];
            if(target >= low && target <= high){
                int start = 0;
                int end = matrix[0].length-1;
                while(start <= end){
                    int mid = start + (end - start) / 2;
                    if(matrix[i][mid] == target){
                        return true;
                    }
                    else if(matrix[i][mid] > target){
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }

                }
            }
        }
        return false;
    }
}
