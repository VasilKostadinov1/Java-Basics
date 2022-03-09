package BASIC.ForCycleExercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int peopleAssess = Integer.parseInt(scanner.nextLine());
        boolean isMoreThan1250 =false;

        for (int i = 1; i <= peopleAssess; i++) {
            String nameAssess = scanner.nextLine();
            double pointsAssess = Double.parseDouble(scanner.nextLine());
            pointsAcademy += nameAssess.length() * pointsAssess / 2;  //дължината на името на оценяващия умножено по точките, които дава делено на две.
            if (pointsAcademy>=1250.50){
                isMoreThan1250=true;
                break;             //в някой момент надхвърли 1250.5 програмата трябва да прекъсне и да се отпечата
            }
        }
        if (isMoreThan1250){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",name,pointsAcademy);
        }else {
            double diff = Math.abs(pointsAcademy-1250.50);
            System.out.printf("Sorry, %s you need %.1f more!",name,diff);
        }
    }
}
