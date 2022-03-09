package BASIC.First;

import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nailon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nailonSum = ((nailon*1.0+2)*1.50);
        double paintSum = ((paint*1.1)*14.50)*1.00;
        double razreditelSum = razreditel*5.00;
        double torbichka = 0.40;
        double totalSum = nailonSum+paintSum+ razreditelSum+torbichka;
        double maistoriSum = (totalSum*0.30)*hours;
        double finalSum =totalSum+maistoriSum;
        System.out.println(finalSum);

    }
}
