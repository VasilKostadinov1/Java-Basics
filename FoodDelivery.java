package BASIC.First;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chicken*10.35;
        double fishPrice = fish*12.40;
        double veganPrice = vegan*8.15;

        double total = (chickenPrice+fishPrice+veganPrice)*1.00;
        double dessert = total*0.20;

        double totalFinal = total+dessert+2.50;
        System.out.println(totalFinal);
    }
}
