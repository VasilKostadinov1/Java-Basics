package BASIC.ForCycleExercise;

import java.util.Scanner;

public class CleverLilly_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundry = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;   // We'll sum all money here!
        int money = 10;    //втория рожден ден получава 10.00 лв
        int toyCount = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {    //четните рождени дни (2, 4, 6...n) получава пари.
                sum += money;
                money += 10;  //!!! сумата се увеличава с 10.00 лв., за всеки следващ четен рожден ден (2 -> 10, 4 -> 20, 6 -> 30...и т.н.
                sum -= 1;     //Братът на Лили, в годините, които тя получава пари, взима по 1.00 лев о

            } else {     //нечетните рождени дни (1, 3, 5...n) получава играчки.
                toyCount++;
            }
        }
        sum+=toyCount*toyPrice;  // we add towards money given, and money from toys
        if (sum>=laundry){
            System.out.printf("Yes! %.2f", Math.abs(sum-laundry));
        }else {
            System.out.printf("No! %.2f", Math.abs(sum-laundry));
        }
    }
}
