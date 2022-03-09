package BASIC.ConditionalsExercises;

import java.util.Scanner;

public class BonusScore_02 {         // %.0f is same as Math.round() -> закръглява до цяло 4исло !!!!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0.0;

        if (points <= 100) {
            bonusPoints = 5;
        } else if (points > 100 && points <= 1000) {
            bonusPoints = points / 5.0;
        } else if (points>1000){
            bonusPoints = points / 10.0;
        }                                   //начисляват се отделно от предходните
        if (points % 2 == 0) {        //	За четно число  + 1 т.
            bonusPoints += 1;
        }
        if (points % 10 == 5) {       //!!!!	За число, което завършва на 5  + 2 т.  // число завършва на 5
            bonusPoints += 2;
        }
        System.out.println(bonusPoints);
        System.out.println(points + bonusPoints);

    }
}

