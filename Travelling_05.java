package BASIC.NestedLoopsLab;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();           //  100/100
        double totalSaved = 0;

             //Трябва да прочетем бюджета след влизането в първия while, защото също така трябва да можем да го прочетем повече от веднъж
        while (!destination.equals("End")) {
            double minBudgetNeeded = Double.parseDouble(scanner.nextLine());

            while (totalSaved < minBudgetNeeded) {
                double moneySaved = Double.parseDouble(scanner.nextLine());
                totalSaved += moneySaved;
            }
            System.out.printf("Going to %s!%n", destination);
            totalSaved=0; // !!! След всяко отиване на екскурзия трябва да нулираш събраната сума,
                           //защото иначе започваш да добавяш новите суми към събраната към момента на първата екскурзия сума.
            destination = scanner.nextLine();
        }
        /*
        Трябва да прочетем бюджета след влизането в първия while, защото също така трябва да можем да го прочетем повече от веднъж, ако Ани ще ходи на повече от една екскурзия.
        Това няма да може да стане, ако го прочетем само в началото преди влизането в първия while цикъл.
         */

    }
}
