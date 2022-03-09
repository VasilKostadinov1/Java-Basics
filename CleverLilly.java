package BASIC.ForCycleLab;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceDishWasher = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        double sumTotal = 0;
        double sumOdd = 0;
        double sumEven = 0;
        int toyCounter = 0;
        //int evenCounter = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
                toyCounter++;
                sumOdd = priceToy * toyCounter;
            } else {
                //evenCounter += 2;
                sumEven +=  (i*10/2)-1;   // !!! took this from another solution

            }
            sumTotal = sumOdd + sumEven;
        }

        if (sumTotal >= priceDishWasher) {
            System.out.printf("Yes! %.2f", Math.abs(sumTotal - priceDishWasher));
        } else {
            System.out.printf("No! %.2f", Math.abs(sumTotal - priceDishWasher));
        }
    }

}
