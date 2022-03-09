package BASIC.ForCycleExercise;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String website = scanner.nextLine();

            switch (website) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;

                default:
                    break;
            }
            if (salary<=0){
                System.out.println("You have lost your salary.");
                break;     // !!! break
            }
        }
        if(salary>0){               // !!! without > 0, will print 0, after "You have lost your salary.", Judge gives 11/100
        int finalSalary= salary;     // !!! print out of the For, otherwise will print the decrement each time - 600, 500, 350...
        System.out.println(Math.abs(finalSalary));}
    }
}
