package BASIC.ConditionalsAdvExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        double moneySpent = 0;
        String campOrHotel = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {      // summer not Summer
                moneySpent = budget * 0.30;
                campOrHotel = "Camp";
            }
            if (season.equals("winter")) {
                moneySpent = budget * 0.70;
                campOrHotel = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                moneySpent = budget * 0.40;
                campOrHotel = "Camp";
            }
            if (season.equals("winter")) {
                moneySpent = budget * 0.80;
                campOrHotel = "Hotel";
            }
        } else {
            destination = "Europe";
            moneySpent = budget * 0.90;
            campOrHotel = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", campOrHotel, moneySpent);
    }
}
