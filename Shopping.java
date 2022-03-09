package BASIC.ConditionalsExercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int video = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double sumVideo = video * 250;
        double priceProcessor = sumVideo * 0.35;
        double sumProcessor = priceProcessor * processor;
        double priceRam = sumVideo * 0.10;
        double sumRam = priceRam * ram;

        double totalSpent = sumVideo + sumProcessor + sumRam;
        //System.out.println(totalSpent);

        if (video > processor) {
            totalSpent = totalSpent * 0.85;
        }
        if (budget >= totalSpent) {
            double moneyEnough = budget - totalSpent;
            System.out.printf("You have %.2f leva left!", moneyEnough);
        } else {
            double moneyNeeded = totalSpent - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", moneyNeeded);
        }

    }
}
