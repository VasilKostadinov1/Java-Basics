package BASIC.ConditionalsExercises;

import java.util.Scanner;

public class TimePlus15Mins_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine());

        int hoursInMins = hours * 60;
        int totalInMinsPlus15 = hoursInMins + mins + 15;

        int hoursPlus15 = totalInMinsPlus15 / 60;
        int minsPlus15 = totalInMinsPlus15 % 60;

        if (hoursPlus15 == 24) {
            hoursPlus15 = 0;
            //hoursPlus15++;
        }
        if (minsPlus15<10){       //  %02d !!!! Минутите се изписват винаги с по две цифри, с водеща нула, когато е необходимо
            System.out.printf("%d:%02d%n", hoursPlus15,minsPlus15);
        } else {
            System.out.printf("%d:%d%n", hoursPlus15,minsPlus15);
        }

    }
}
