package BASIC.NestedLoopsExercises;

import java.util.Scanner;

public class PasswordGenerator_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {                 // a=97
                for (int k = 97; k < 97 + l; k++) {       //Символ 3: малка буква измежду първите l букви на латинската азбука.
                    for (int m = 'a'; m < 'a' + l; m++) {   //Символ 4: малка буква измежду първите l букви на латинската азбука.
                        for (int h = 1; h <= n; h++) {
                            if (h > i && h > j) {         //Символ 5: цифра от 1 до n, по-голяма от първите 2 цифри.
                                System.out.printf("%d%d%c%c%d ", i, j, k, m, h);
                                //System.out.printf("%d%d%c%c%d ", i, j, a, b, h);
                            }
                        }
                    }
                }
            }
        }
    }
}
