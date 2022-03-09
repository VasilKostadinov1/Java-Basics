package BASIC.ConditionalsAdvExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFlower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double totalPrice = 0;


        switch (typeFlower) {
            case "Roses":
                price = 5;
                totalPrice = price * count;
                if (count > 80) {
                    totalPrice = totalPrice * 0.90;
                }
                break;
            case "Dahlias":
                price = 3.80;
                totalPrice = price * count;
                if (count > 90) {
                    totalPrice = totalPrice * 0.85;
                }
                break;

            case "Tulips":
                price = 2.80;
                totalPrice = price * count;
                if (count > 80) {
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Narcissus":
                price = 3;
                totalPrice = price * count;
                if (count < 120) {                         // < 120  !!!
                    totalPrice = totalPrice * 1.15;
                }
                break;
            case "Gladiolus":
                price = 2.50;
                totalPrice = price * count;
                if (count < 80) {                        //< 80 !!!
                    totalPrice = totalPrice * 1.20;
                }
                break;
        }
        if (budget >= totalPrice) {
            double leftMoney = budget - totalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, typeFlower, leftMoney);
        } else {
            double neededMoney = totalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
        }
    }
}
