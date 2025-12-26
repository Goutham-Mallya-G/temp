package may18._3;
import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < strs.length ; i++){

            int[] freq = new int[26];
            for(char ch : strs[i].toCharArray()){
                freq[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < freq.length ; j++){
                while(freq[j] > 0){
                    sb.append((char)(j+'a'));
                    freq[j]--;
                }
            }
            String key = sb.toString();

            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(strs[i]);
            }else{
                map.put(key , new ArrayList<>());
                i--;
            }
        }

        for(List<String> list : map.values()){
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
}