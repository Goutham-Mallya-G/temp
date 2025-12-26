package Greedy;

import java.util.*;
public class AssignCookies {
    public static void main(String[] args) {
        int[] g = new int[]{1,2,3};
        int[] s = new int[]{1,1};
        System.out.println(findContentChildren(g , s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int ans = 0;
        while(i < g.length && j < s.length){
            if(g[i] <= s[j]){
                j++;
                i++;
                ans++;
            }else if(s[j] < g[i]){
                j++;
            }
        }
        return ans;
    }
}
