package BASIC.First;

import java.util.Scanner;

public class CalculatorDeposits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposits = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double interest = deposits*percent/100;
        double interestOneMonth = interest/12;
        double total = deposits+(period*interestOneMonth);

        System.out.print(total);

    }
}
