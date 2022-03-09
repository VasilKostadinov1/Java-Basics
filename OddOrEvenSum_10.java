package BASIC.ForCycleLab;

import java.util.Scanner;

public class OddOrEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < n; i++) {   //for (int i = 1; i <= n ; i++)
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (i % 2 != 0) {             // !!! we need the index of the num=> i; if written "currNum", we'll check if the cur num is even or odd, while we need the index check
                sumOdd += currentNumber;
            } else {
                sumEven += currentNumber;
            }
        }
        if (sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEven);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sumEven - sumOdd));
        }

    }
}
