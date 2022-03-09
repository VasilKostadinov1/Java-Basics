package BASIC.ForCycleLab;

import java.util.Scanner;

public class LeftAndRightSum2_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());  // чете 2 * n-на брой цели числа
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            int number1 = Integer.parseInt(scanner.nextLine());   //чете 2 * n-на брой цели числа
            sum1 = sum1 + number1;
        }
        for (int i = 1; i <= n; i++) {
            int number2 = Integer.parseInt(scanner.nextLine());  //чете 2 * n-на брой цели числа
            sum2 = sum2 + number2;
        }
        if (sum1 == sum2) {
            System.out.println("Yes, sum = " + sum1);
        } else {
            int diff = Math.abs(sum1 - sum2);
            System.out.println("No, diff = " + diff);
        }
    }
}
