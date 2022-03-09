package BASIC.NestedLoopsLab;

import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int flour = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int i = flour; i >= 1; i--) {         //номерата на стаите в една сграда (в низходящ ред
            for (int j = 0; j < rooms; j++) {
                if (i == flour) {                       //•	На последният етаж винаги има апартаменти и те са по-големи
                    System.out.printf("L%d%d ", i, j);
                } else if (i % 2 == 0) {                  //На всеки четен етаж има само офиси
                    System.out.printf("O%d%d ", i, j);
                } else {                                 //	На всеки нечетен етаж има само апартаменти
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.println();  // new line at each floor
        }
    }
}
