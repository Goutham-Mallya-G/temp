package may18._1;


public class SecondLargestWordInString {
    public static void main(String[] args) {
        String str = "I love zoho";
        System.out.println(secLar(str));
    }
    private static String secLar(String s){
        String[] arr = s.split(" ");
        String largest = "";
        String secondLargest = "";
        for(String str : arr){
            if(str.length() > largest.length()){
                secondLargest = largest;
                largest = str;
            }else if(str.length() < largest.length() && str.length() > secondLargest.length()){
                secondLargest = str;
            }
        }
        if (secondLargest != null){
            return secondLargest;
        }
        return null;
    }
}