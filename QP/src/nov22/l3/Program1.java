package nov22.l3;
public class Program1 {
    public static void main(String[] args) {
        String input = "abc111";

        if(input.equals("") || !checkNumber(input)){
            System.out.println(-1);
            return;
        }

        String validInput = removeDuplicate(input);


        char[] str = validInput.toCharArray();

        int sum = 0;

        for(int i = 0 ; i < str.length ; i++){
            if(Character.isDigit(str[i])){
                sum+= str[i] - '0';
            }
        }

        for(int i = 0 ; i < str.length ; i++){
            char ch = str[i];
            if(Character.isLetter(ch)){
                changeLetter(str, i);
            }else if(Character.isDigit(ch)){
                changeDigit(str , i);
            }
        }

        reversebysum(str , sum);

        reverse(str , 0, str.length-1);

        for(int i = 0 ; i < str.length ; i++){
            System.out.print(str[i]);
        }
    }

    private static void changeLetter(char[] str , int i){
        int val = ((int)str[i] + 3)% 122;
        str[i] = (char) (val);
    }

    private static void changeDigit(char[] str , int i){
        int val = 9 - ((int)str[i] - '0');
        char change = Character.forDigit(val,10);
        str[i] = (change);
    }

    private static void reverse(char[] str , int i , int j){
        while(i < j){
            char temp  = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }

    private static void reversebysum(char[] str , int sum){
        sum = sum % str.length;
        reverse(str , 0 , sum-1);
        reverse(str , sum , str.length-1);
        reverse(str , 0, str.length-1);
    }

    private static String removeDuplicate(String input){
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < input.length()-1 ; i++){
            if(Character.isDigit(input.charAt(i))){
                while(i < input.length()-1 && input.charAt(i) == input.charAt(i+1)){
                    i++;
                }
            }
            result.append(input.charAt(i));
        }
        return result.toString();
    }

    private static boolean checkNumber(String input){
        for(int i = 0 ; i < input.length() ; i++){
            if(Character.isLetter(input.charAt(i))){
                return true;
            }
        }
        return false;
    }

}