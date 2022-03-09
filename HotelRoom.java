package BASIC.ConditionalsAdvExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;        // declare separate totals for studio and apartments !!!
        double priceApartment = 0;     // use only "<", without "=" ;

        switch (month) {
            case "May":
            case "October":
                priceStudio = countNights * 50;
                priceApartment = countNights * 65;
                if (countNights > 7 && countNights<13) {    //•	За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
                    priceStudio = priceStudio * 0.95;
                } else if (countNights > 14) {       //•	За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
                    priceStudio = priceStudio * 0.70;
                }

                break;
            case "June":
            case "September":
                priceStudio = countNights * 75.20;
                priceApartment = countNights * 68.70;
                if (countNights > 14) {           // •	За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
                    priceStudio = priceStudio * 0.80;
                }

                break;
            case "July":
            case "August":
                priceStudio = countNights * 76;
                priceApartment = countNights * 77;

                break;
            default:
                break;
        }
        if (countNights > 14) {        //•	За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
            priceApartment = priceApartment * 0.90;
        }

        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);

    }
}
