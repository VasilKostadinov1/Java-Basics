package BASIC.ConditionalsLab;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 == 0) {
            System.out.println("even");
        } else if (number % 2 == 1) {
            System.out.println("odd");
        }
        if (number == -1) {
            System.out.println("odd");
        }
    }
}
