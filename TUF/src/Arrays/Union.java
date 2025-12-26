package Arrays;


import java.util.*;

public class Union {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 2, 1};
        int[] b = new int[]{3, 2, 2, 3, 3, 2};
        System.out.println(union(a , b));
    }
    private static ArrayList<Integer> union(int[] a , int[] b){
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                if(ans.isEmpty() || ans.get(ans.size()-1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            }else if(b[j] < a[i]){
                if(ans.isEmpty() || ans.get(ans.size()-1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            }
        }
        while(i < a.length){
            if(ans.isEmpty() || ans.get(ans.size()-1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }
        while(j < b.length){
            if(ans.isEmpty() || ans.get(ans.size()-1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }
        return ans;
    }
}
