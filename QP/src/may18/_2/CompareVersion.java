package may18._2;

public class CompareVersion {
    public static void main(String[] args) {
        String version1 = "1.2";
        String version2 = "1.10";
        System.out.println(compareVersion(version1 , version2));
    }
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int ver1 = 0;
        int ver2 = 0;
        int min = Math.min(v1.length , v2.length);
        for(int i = 0 ; i < min ; i++){
            ver1 += Integer.parseInt(v1[i]);
            ver2 += Integer.parseInt(v2[i]);
            if(ver1 < ver2)return -1;
            if(ver1 > ver2)return 1;
        }
        ver1 = 0;
        ver2 = 0;
        for(String str : v1){
            ver1 += Integer.parseInt(str);
        }
        for(String str : v2){
            ver2 += Integer.parseInt(str);
        }
        if(ver1 < ver2) return -1;
        if(ver1 > ver2) return 1;
        return 0;
    }
}
