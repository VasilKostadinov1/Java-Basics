package BASIC.NestedLoopsExercises;

import java.util.Scanner;

public class SumPrimeNonPrime_Kaloyan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;
        while (!input.equals("stop")) {
            boolean isNonPrime = false;      // needs to be zero-ed/changed/updated, after each new number read -> in the while
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            // Проверка дали числото е просто
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isNonPrime = true;    // non-prime
                    break;
                }
            }
            if (isNonPrime) {
                nonPrimeSum += number;
            } else {
                primeSum += number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n" +
                "Sum of all non prime numbers is: %d", primeSum, nonPrimeSum);


    }
}
