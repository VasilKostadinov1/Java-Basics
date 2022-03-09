package BASIC.ForCycleLab;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int sumLeft = 0;
        int sumRight = 0;
                             // 2 for loops used, as we want 1st to check sum of Left, and after - sum of right !!!
        for (int i = 0; i < numbers; i++) {
            sumLeft += scanner.nextInt();
        }
        for (int i = 0; i < numbers; i++) {
            sumRight += scanner.nextInt();
        }
        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumLeft - sumRight));
        }

    }
}
