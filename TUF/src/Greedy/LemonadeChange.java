package Greedy;

public class LemonadeChange {
    public static void main(String[] args) {
        int[] bills = new int[]{5,5,5,5,20,20,5,5,20,5};
        System.out.println(lemonadeChange(bills));
    }
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for(int i = 0 ; i < bills.length ; i++){
            if(bills[i] == 5){
                five += 5;
            }else if(bills[i] == 10){
                ten += 10;
                if(five >= 5){
                    five -= 5;
                }else{
                    return false;
                }
            }else if(bills[i] == 20){
                twenty += 20;
                if(ten >= 10){
                    bills[i] -= 10;
                    ten -= 10;
                }
                while(bills[i] != 5 && five != 0){
                    five -= 5;
                    bills[i] -=5;
                }
                if(bills[i] != 5) return false;
            }
        }
        return true;
    }
}
