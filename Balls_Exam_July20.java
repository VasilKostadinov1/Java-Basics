package BASIC.ForCycleLab;

import java.util.Scanner;

public class Balls_Exam_July20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int black = 0;
        int totalPoints = 0;
        int orangeCounter=0;
        int redCounter=0;
        int yellowCounter=0;
        int whiteCounter=0;
        int blackCounter=0;
        int defaultCounter=0;

        for (int i = 1; i <= count; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    red += 5;
                    totalPoints += 5;
                    redCounter++;
                    break;
                case "orange":
                    orange += 10;
                    totalPoints += 10;
                    orangeCounter++;
                    break;
                case "yellow":
                    yellow += 15;
                    totalPoints += 15;
                    yellowCounter++;
                    break;
                case "white":
                    white += 20;
                    totalPoints += 20;
                    whiteCounter++;
                    break;
                case "black":
                    totalPoints = (totalPoints / 2);
                    blackCounter++;
                    break;
                default:
                    defaultCounter++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Points from red balls: %d%n", redCounter);
        System.out.printf("Points from orange balls: %d%n", orangeCounter);
        System.out.printf("Points from yellow balls: %d%n", yellowCounter);
        System.out.printf("Points from white balls: %d%n", whiteCounter);
        System.out.printf("Other colors picked: %d%n",defaultCounter);
        System.out.printf("Divides from black balls: %d%n", blackCounter);

    }
}
