package BASIC.ConditionalsAdvExercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int countFishermen = Integer.parseInt(scanner.nextLine());
        double discount = 0;
        //double totalSum = 0;

        double priceRent = 0;
        switch (season) {
            case "Spring":
                priceRent = 3000;
                break;
            case "Summer":
            case "Autumn":
                priceRent = 4200;
                break;
            case "Winter":
                priceRent = 2600;
                break;
            default:
                break;
        }
        if (countFishermen <= 6) {
            priceRent = priceRent * 0.90;
        } else if (countFishermen > 7 && countFishermen <= 11) {
            priceRent = priceRent * 0.85;
        } else if (countFishermen >= 12) {
            priceRent = priceRent * 0.75;
        }
        if (countFishermen % 2 == 0 && !season.equals("Autumn")) {
            priceRent = priceRent * 0.95;
        }
        if (budget >= priceRent) {
            double leftMoney = budget - priceRent;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else {
            double neededMoney = priceRent - budget;
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        }


    }
}
