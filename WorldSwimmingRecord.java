package BASIC.ConditionalsExercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSec = Double.parseDouble(scanner.nextLine());
        double metresPass = Double.parseDouble(scanner.nextLine());
        double recordInSecFor1Meter = Double.parseDouble(scanner.nextLine());

        double distanceToPass = metresPass * recordInSecFor1Meter;     //!!! brackets of Math.floor DO NOT include 12.5
        double delay15Metres = Math.floor((metresPass / 15)) * 12.5;    // Math.floor !!!! резултатът трябва да се закръгли надолу
        double totalTime = distanceToPass + delay15Metres;
        //System.out.println(totalTime);

        if (totalTime >= recordInSec) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(totalTime - recordInSec));
        } else if (totalTime < recordInSec) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
