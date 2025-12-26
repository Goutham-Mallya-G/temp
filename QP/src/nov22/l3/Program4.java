package nov22.l3;

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw : ");
        int amount = sc.nextInt();
        int deno = 0;
        ArrayList<Integer> denominations = new ArrayList<>();
        System.out.println("Enter the required denominations , to stop add denom -1");
        while(denominations.size() == 0 || deno > 0 ) {
            System.out.print("Enter the denaomination : ");
            deno = sc.nextInt();
            if(deno > 0) {
                denominations.add(deno);
            }
        }

        HashMap<Integer, Integer> stock = new HashMap<>();
        for(int i = 0 ; i < denominations.size() ; i++){
            System.out.print("Enter the num of notes for " + denominations.get(i) + " : ");
            int count = sc.nextInt();
            stock.put(denominations.get(i) , count);
        }

        for (int i = 0; i < denominations.size() - 1; i++) {
            for (int j = 0; j < denominations.size() - i - 1; j++) {
                if (denominations.get(j) < denominations.get(j + 1)){
                    int temp = denominations.get(j);
                    denominations.set(j,denominations.get(j+1));
                    denominations.set(j + 1,  temp);
                }
            }
        }

        int remainingAmount = amount;
        HashMap<Integer, Integer> notesUsed = new HashMap<>();

        for (int denom : denominations) {
            if (remainingAmount == 0) {
                break;
            }
            int notesToTake = 0;
            int notesInstack = stock.getOrDefault(denom, 0);

            if (notesInstack == 0) {
                continue;
            }
            notesToTake = remainingAmount / denom;

            int availableNotes = Math.min(notesToTake, notesInstack);

            if (availableNotes > 0) {
                notesUsed.put(denom, availableNotes);
                remainingAmount -= availableNotes * denom;
            }
        }

        if (remainingAmount == 0) {
            for (int denom : notesUsed.keySet()) {
                System.out.println(denom + " : " + notesUsed.get(denom));
            }
        } else {
            System.out.println("Not possible");
        }
    }
}
