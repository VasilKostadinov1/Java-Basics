package BASIC.ConditionalsLab;

import java.util.Scanner;

public class ToyShopMagazine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sum = puzzles * 2.60 + dolls * 3.0 + bears * 4.10 + minions * 8.20 + trucks * 2.0;
        double countToys = puzzles + dolls + bears + minions + trucks;
        double discount = 0;

        if (countToys >= 50) {
            discount = sum / 4;
        } else {
            discount = 0;
        }
        double endPrice = sum - discount;
        double rent = endPrice / 10;
        double profit = endPrice - rent;
        if (profit >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", Math.abs(profit - tripPrice));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(profit - tripPrice));
        }

    }
}
