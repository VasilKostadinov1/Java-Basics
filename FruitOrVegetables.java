package BASIC.ConditionalsAdvLab;

import java.util.Scanner;

public class FruitOrVegetables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruitOrVeg = scanner.nextLine();

        if (fruitOrVeg.equals("banana") || fruitOrVeg.equals("apple") || fruitOrVeg.equals("kiwi")
                || fruitOrVeg.equals("cherry") || fruitOrVeg.equals("lemon") || fruitOrVeg.equals("grapes")) {
            System.out.println("fruit");
        } else if (fruitOrVeg.equals("tomato") || fruitOrVeg.equals("cucumber") || fruitOrVeg.equals("pepper")
                || fruitOrVeg.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
