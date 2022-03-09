package BASIC.NestedLoopsExercises;

import java.util.Scanner;

public class SpecialNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (n % i == 0 && n % j == 0 && n % k == 0 && n % l == 0) {
                            //System.out.print(i + "" + j + "" + k + "" + l + " ");
                            System.out.printf("%d%d%d%d ",i,j,k,l);

                        }
                    } // N = 16, 2418 е специално число because •	16 / 2 = 8 без остатък;•	16 / 4 = 4 без остатък
                }
            }
        }
    }
}
