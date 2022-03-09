package BASIC.NestedLoopsExercises;

import java.util.Scanner;

public class EqualSumEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second; i++) {
            String currentNum = "" + i; // hint-	Вземете числото на текущата позиция като текст, като го конкатенирате с празен стринг:
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int current = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    evenSum += current;
                } else {
                    oddSum += current;
                }
            }
            if (oddSum == evenSum) {       //•	сумата от цифрите на четни и нечетни позиции да са равни
                System.out.print(i + " ");
            }
        }
    }
}
