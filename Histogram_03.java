package BASIC.ForCycleExercise;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int countP1 = 0;
        int countP2 = 0;
        int countP3 = 0;
        int countP4 = 0;
        int countP5 = 0;
        //int countTotal = 0;

        for (int i = 1; i <= n; i++) {
            int current = Integer.parseInt(scanner.nextLine());
            if (current < 200) {
                countP1++;
            } else if (current <= 399) {
                countP2++;
            } else if (current <= 599) {
                countP3++;
            } else if (current <= 799) {
                countP4++;
            } else if (current <= 1000) {
                countP5++;
            }
        }
        System.out.printf("%.2f%%%n", (double) countP1 / n * 100);  // %%=percent  // %%%n=percent new line
        System.out.printf("%.2f%%%n", (double) countP2 / n * 100);
        System.out.printf("%.2f%%%n", (double) countP3 / n * 100);
        System.out.printf("%.2f%%%n", (double) countP4 / n * 100);
        System.out.printf("%.2f%%%n", (double) countP5 / n * 100);

    }
}
