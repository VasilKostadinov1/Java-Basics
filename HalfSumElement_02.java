package BASIC.ForCycleExercise;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
            if (currentNumber > max) {
                max = currentNumber;
            }
        }                                 // unknown Sum + max = sum;
        int sumWithoutMaxNumber = sum-max;  //проверява дали сред тях съществува число, което е равно на сумата на всички останали.
        if (max==sumWithoutMaxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        } else  {
            System.out.println("No");
            int diff = Math.abs(max-sumWithoutMaxNumber);
            System.out.printf("Diff = %d", diff);
        }


    }
}
