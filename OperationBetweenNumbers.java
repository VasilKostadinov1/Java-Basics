package BASIC.ConditionalsAdvExercise;

import java.util.Scanner;

public class OperationBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();      //: „+“, „-“, „*“, „/“, „%“

        if (operator.equals("+")){
            int plusResult =n1+n2;
            if (plusResult%2==0){
                System.out.printf("%d %s %d = %d - even",n1,operator,n2,plusResult);
            }else {
                System.out.printf("%d %s %d = %d - odd",n1,operator,n2,plusResult);
            }
        }else if (operator.equals("-")){
            int minusResult =n1-n2;
            if (minusResult%2==0){
                System.out.printf("%d %s %d = %d - even",n1,operator,n2,minusResult);
            }else {
                System.out.printf("%d %s %d = %d - odd",n1,operator,n2,minusResult);
            }
        }else if (operator.equals("*")){
            int multiplyResult =n1*n2;
            if (multiplyResult%2==0){
                System.out.printf("%d %s %d = %d - even",n1,operator,n2,multiplyResult);
            }else {
                System.out.printf("%d %s %d = %d - odd",n1,operator,n2,multiplyResult);
            }
        }else if(operator.equals("/")){
            if (n2==0){
                System.out.printf("Cannot divide %d by zero%n",n1);
            }else {
            double divideResult =n1*1.0/n2;
            System.out.printf("%d / %d = %.2f",n1,n2,divideResult);}
        }else if(operator.equals("%")){
            if (n2==0){
                System.out.printf("Cannot divide %d by zero%n",n1);
            } else {
            int divideResult =n1%n2;
            System.out.printf("%d %% %d = %d",n1,n2,divideResult);}
        }

    }
}
