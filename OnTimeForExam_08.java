package BASIC.ConditionalsAdvExercise;

import java.util.Scanner;

public class OnTimeForExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minArrive = Integer.parseInt(scanner.nextLine());

        int examInMins = hourExam * 60 + minExam;
        int arriveInMins = hourArrive * 60 + minArrive;

        if (arriveInMins + 30 < examInMins) {
            System.out.println("Early");
            int earlyTime = examInMins - arriveInMins;
            int h = earlyTime / 60;
            int m = earlyTime % 60;
            if (h == 0) {
                System.out.printf("%d minutes before the start", m);
            } else {
                System.out.printf("%d:%02d hours before the start", h, m);  //    %d:%02d
            }
        } else if (arriveInMins > examInMins) {
            System.out.println("Late");
            int lateTime = Math.abs(examInMins - arriveInMins);
            int h = lateTime / 60;
            int m = lateTime % 60;
            if (h == 0) {
                System.out.printf("%d minutes after the start", m);
            } else {
                System.out.printf("%d:%02d hours after the start", h, m);
            }
        } else {
            System.out.println("On time");
            int onTime = examInMins - arriveInMins;
            //int h = onTime/60;
            int m = onTime % 60;
            if (m == 0) {
                System.out.println("");
            } else {
                System.out.printf("%d minutes before the start", m);
            }
        }
    }
}
