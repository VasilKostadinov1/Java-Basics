package BASIC.NestedLoopsLab;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());

        int combinationCounter = 0;
        boolean isValidFound = false;

        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                combinationCounter++;
                if (i + j == magic) {            // use i and j; not "start" and "end"
                    //isValidFound = true;
                    System.out.printf
                            ("Combination N:%d (%d + %d = %d)%n", combinationCounter, i, j, magic);     // !!! use i and j
                    return;  //!!!! otherwise, prints all Combinations; break - escapes only of 1 For loop
                }
            }
        }
        if (!isValidFound){     // !!! without ""!"" is not printing the below line; jumps out - seen by the debugger!!
            System.out.printf("%d combinations - neither equals %d", combinationCounter ,magic);
        }
    }
}
