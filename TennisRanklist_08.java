package BASIC.ForCycleExercise;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {           // 100/100
        Scanner scanner = new Scanner(System.in);
        int countTournaments = Integer.parseInt(scanner.nextLine());
        int initPoints = Integer.parseInt(scanner.nextLine());
        int currentPoints = 0;
        int finalPoints = 0;
        int finalFinalPoints = 0;
        int counter = 0;
        int counterW = 0;

        for (int i = 1; i <= countTournaments; i++) {
            String stage = scanner.nextLine();   //текст – "W", "F" или "SF"
            counter++;
            switch (stage) {
                case "W":
                    counterW++;
                    currentPoints = 2000;
                    break;
                case "F":
                    currentPoints = 1200;
                    break;
                case "SF":
                    currentPoints = 720;
                    break;
            }
            finalPoints += currentPoints;
        }
        int average = finalPoints / counter;                     // without initPoints
        finalFinalPoints = finalPoints + initPoints;             // add initPoints to the finalFinal
        System.out.printf("Final points: %d%n", finalFinalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(1.0*average));  //Средните точки да бъдат закръглени към най-близкото цяло число надолу
        double percentW = (double)counterW * 100 / counter;      // double !!! otherwise - 33/100
        System.out.printf("%.2f%%",  percentW);


    }
}
