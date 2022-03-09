package BASIC.NestedLoopsLab;

import java.util.Scanner;

public class Travelling2_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();   // destination & budget -> they are pair!!!

        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
                                          // спираме: budget <= saved (спестени пари)
            double sum = 0;              //-> продължава: budget > saved!!!
            while (budget > sum) {
                double saved = Double.parseDouble(scanner.nextLine());
                sum += saved;
            }
            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }


    }
}
