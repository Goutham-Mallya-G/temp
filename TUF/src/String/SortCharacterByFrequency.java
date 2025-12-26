package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        String str = "tree";
        System.out.println(frequencySort(str));
    }
    public static String frequencySort(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0)+1);
        }
        ArrayList<Object[]> list = new ArrayList<>();
        for(Map.Entry<Character , Integer> entry : map.entrySet()){
            Object[] obj = new Object[2];
            obj[0] = entry.getKey();
            obj[1] = entry.getValue();
            list.add(obj);
        }
        StringBuilder ans = new StringBuilder();
        list.sort((a,b) -> ((int)b[1]) - ((int)a[1]) );
        for(int i = 0 ; i < list.size() ; i++){
            int num = (int)(list.get(i)[1]);
            while(num > 0){
                ans.append(list.get(i)[0]);
                num--;
            }
        }
        return ans.toString();
    }
}
