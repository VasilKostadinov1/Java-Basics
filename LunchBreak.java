package BASIC.ConditionalsExercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int movieTime = Integer.parseInt(scanner.nextLine());  //2.	Продължителност на епизод  – цяло число
        int breakTime = Integer.parseInt(scanner.nextLine());  //3.	Продължителност на почивката  – цяло число

        double lunchTime = breakTime/8.0;                  // gives 100/100 with doubles !!!
        double restTime = breakTime/4.0;                   // gives 100/100 with doubles !!!

        double leftTime = breakTime-lunchTime-restTime;

        if (leftTime>=movieTime){
            double timeLeft = Math.ceil(leftTime-movieTime);    // %.0f
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movie, timeLeft);
        }else{
            double timeMoreNeeded = Math.abs(leftTime-movieTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movie, timeMoreNeeded);
        }
    }
}
