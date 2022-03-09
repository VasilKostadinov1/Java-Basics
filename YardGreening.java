package BASIC.FirstStepsLab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double metresSq = Double.parseDouble(scanner.nextLine());

        double yard = metresSq * 7.61;
        double discount = yard * 0.18;
        double sum = yard * 0.82;

        System.out.printf("The final price is: %.2f lv. %n", sum);
        System.out.printf("The discount is: %.2f lv.", discount);

        //System.out.println("The final price is: "+sum+" lv.");
        //System.out.println("The discount is: "+discount+" lv.");

    }
}
