package BASIC.ForCycleLab;

import java.util.Scanner;

public class NumberSequence_08_Max_Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;          //възможно най-малко
        int min = Integer.MAX_VALUE;          //възмоцно най-голямата  //MaxValue = 2147483647;

        for (int i = 1; i <= numbers; i++) {
            int currentNUmber = Integer.parseInt(scanner.nextLine());
            if (currentNUmber > max) {        // //проверка дали моето число е максимално
                max = currentNUmber;          // max = ....
            }
            if (currentNUmber < min) {         //проверка дали моето число е минимално
                min = currentNUmber;          // min =......
            }
        }
        System.out.printf("Max number: %d%n", max);
        System.out.printf("Min number: %d", min);

    }
}
