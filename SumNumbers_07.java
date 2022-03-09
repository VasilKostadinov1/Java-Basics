package BASIC.ForCycleLab;

import java.util.Scanner;

public class SumNumbers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {                          // int i = 1; i <= n; i++
            int m = Integer.parseInt(scanner.nextLine());
            sum += m;
        }
        System.out.println(sum);


    }
}
