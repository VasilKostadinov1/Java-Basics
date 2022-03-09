package BASIC.NestedLoopsExercises;

import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isBigger = false;
        int count = 1;
                  // За да излезем и от двата цикъла трябва да използваме оператора break и в двата.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {   //!!! j<=i
                if (count > n) {
                    isBigger = true;
                    break;
                }
                System.out.print(count + " ");
                count++;
            }
            if (isBigger) {   //	В тялото на външния цикъл, направете проверка дали трябва да излезем и от него.
                break;
            }
            System.out.println();
        }

        }

    }

