package jun01._1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubfolder {
    public static void main(String[] args) {
        String[] folder = new String[]{"/a","/a/b","/c/d","/c/d/e","/c/f"};
        System.out.println(removeSubfolders(folder));
    }
    public static List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();

        String prev = "";

        for (String f : folder) {
            if (prev.isEmpty() || !f.startsWith(prev + "/")) {
                result.add(f);
                prev = f;
            }
        }

        return result;
    }
}
