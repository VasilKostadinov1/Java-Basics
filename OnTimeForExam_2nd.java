package BASIC.ConditionalsAdvExercise;

import java.util.Scanner;

public class OnTimeForExam_2nd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMin = Integer.parseInt(scanner.nextLine());

        int arriveInMin = arriveHour * 60 + arriveMin;
        int examInMin = examHour * 60 + examMin;
        String status = "";
        int diff = Math.abs(arriveInMin - examInMin);

        if (arriveInMin + 30 < examInMin) {
            status = "Early";
            if (diff < 60) {
                System.out.println(status);
                System.out.printf("%d minutes before the start", diff);
            } else {
                int h = diff / 60;
                int m = diff % 60;
                System.out.println(status);
                System.out.printf("%d:%02d hours before the start", h, m);
            }
        } else if (arriveInMin <= examInMin) {
            status = "On time";
            System.out.println(status);
            System.out.printf("%d minutes before the start", diff);

        } else {
            status = "Late";
            if (diff < 60) {
                System.out.println(status);
                System.out.printf("%d minutes afetr the start", diff);
            } else {
                int h = diff / 60;
                int m = diff % 60;
                System.out.println(status);
                System.out.printf("%d:%02d hours after the start", h, m);
            }

        }
    }
}
