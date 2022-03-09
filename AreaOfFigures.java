package BASIC.ConditionalsLab;

import java.util.Scanner;

public class AreaOfFigures {              //// %.0f is same as Math.round() -> закръглява до цяло 4исло !!!!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String form = scanner.nextLine();

        if (form.equals("square")) {
            double length = Double.parseDouble(scanner.nextLine());
            double volume = length * length;
            System.out.printf("%.3f", volume);

        } else if (form.equals("rectangle")) {
            double length1 = Double.parseDouble(scanner.nextLine());
            double length2 = Double.parseDouble(scanner.nextLine());
            double volume = length1 * length2;
            System.out.printf("%.3f", volume);

        } else if (form.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double volume = radius * radius * Math.PI;
            //double volume =Math.PI*Math.pow(radius,2)
            System.out.printf("%.3f", volume);

        } else if (form.equals("triangle")) {
            double length1 = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double volume = (length1 * height) / 2;
            System.out.printf("%.3f", volume);

        }
    }

}
