package BASIC.ConditionalsExercises;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int total = first + second + third;   // total time in sec

        int minutes = total / 60;          // find mins
        int seconds = total % 60;         // find secs

        if (seconds < 10) {                          //Секундите се изписват винаги с по две цифри, с водеща нула, когато е необходимо
            System.out.printf("%d:0%d", minutes, seconds);   // 2:04 same as -> "%d:%02d
        } else {
            System.out.printf("%d:%d", minutes, seconds);    // 2:29
        }

    }
}
