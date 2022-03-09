package BASIC.ConditionalsAdvExercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();  // 	Premiere, 	Normal ,	Discount
        int line = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());
        double price =0;

        int area = line*column;
        if (type.equals("Premiere")){
            price=12;
        }else if (type.equals("Normal")){
            price=7.50;
        }else {
            price=5.0;
        }
        double total = area*price;
        System.out.printf("%.2f leva",total);
    }

}
