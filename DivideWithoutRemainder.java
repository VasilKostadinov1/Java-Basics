package BASIC.ForCycleExercise;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countP1 = 0;
        int countP2 = 0;
        int countP3 = 0;

        for (int i = 1; i <= n; i++) {
            int current = Integer.parseInt(scanner.nextLine());
            if (current % 2 == 0) {
                countP1++;
            }  if (current % 3 == 0) {   // not "else if", as it could be divisible simultaneously on 2 and 3 and 4
                countP2++;
            }  if (current % 4 == 0) {
                countP3++;
            }
        }
        System.out.printf("%.2f%%%n", 1.0* countP1 / n * 100);
        System.out.printf("%.2f%%%n", (double) countP2 / n * 100);
        System.out.printf("%.2f%%%n", (double) countP3 / n * 100);


    }


}
