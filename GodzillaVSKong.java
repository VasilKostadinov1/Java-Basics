package BASIC.ConditionalsExercises;

import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statCount = Integer.parseInt(scanner.nextLine());
        double pricePer1StatCount = Double.parseDouble(scanner.nextLine());

        double decorSum = budget / 10;
        double clothingSum = statCount * pricePer1StatCount;
        if (statCount >= 150) {                     //•	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.
            clothingSum = clothingSum * 0.90;
        }
        double totalSum = decorSum + clothingSum;

        double startFilm = budget - totalSum;
        if (startFilm >= 0) {
            System.out.printf("Action!\n" +
                    "Wingard starts filming with %.2f leva left.\n", startFilm);
        } else {
            double notStartFilm = budget - totalSum;
            System.out.printf("Not enough money!\n" +
                    "Wingard needs %.2f leva more.\n", Math.abs(notStartFilm));
        }
        // %.0f is same as Math.round() -> закръглява до цяло 4исло !!!!

    }
}
