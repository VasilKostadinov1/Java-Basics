package BASIC.NestedLoopsExercises;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;
        while (!input.equals("stop")) {
            boolean isNonPrime = false;
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue; //В този случай въведено число се игнорира и не се прибавя към нито една от двете суми, а програмата продължава
            }
            // Проверка дали числото е просто
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {   // its non-prime
                    isNonPrime = true; // because it divides also to some other number, not only itself
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
