package BASIC.ConditionalsAdvLab;

import java.util.Scanner;

public class TradeCommssions {                       // 94/100
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double volumeSold = Double.parseDouble(scanner.nextLine());
        double tradeCom = 0;


        switch (town) {
            case "Sofia":
                if (volumeSold >= 0 && volumeSold <= 500) {
                    tradeCom= volumeSold * 5 / 100;
                }
                else if (volumeSold > 500 && volumeSold <= 1000) {
                    tradeCom= volumeSold * 7 / 100;
                }
                else if (volumeSold > 1000 && volumeSold <= 10000) {
                    tradeCom=  volumeSold * 8 / 100;
                }
                else if (volumeSold > 10000) {
                    tradeCom= volumeSold * 12 / 100;
                }
                break;

            case "Varna":
                if (volumeSold >= 0 && volumeSold <= 500) {
                    tradeCom= volumeSold * 4.5 / 100;
                }
                else if (volumeSold > 500 && volumeSold <= 1000) {
                    tradeCom= volumeSold * 7.5 / 100;
                }
                else if (volumeSold > 1000 && volumeSold <= 10000) {
                    tradeCom= volumeSold * 10 / 100;
                }
                else if (volumeSold > 10000) {
                    tradeCom= volumeSold * 13 / 100;
                }
                ;
                break;

            case "Plovdiv":
                if (volumeSold >= 0 && volumeSold <= 500) {
                    tradeCom= volumeSold * 5.5 / 100;
                }
                else if (volumeSold > 500 && volumeSold <= 1000) {
                    tradeCom= volumeSold * 8 / 100;
                }
                else if (volumeSold > 1000 && volumeSold <= 10000) {
                    tradeCom= volumeSold * 12 / 100;
                }
                else if (volumeSold > 10000) {
                    tradeCom= volumeSold * 14.5 / 100;
                }
                ;
                break;
            default:
                tradeCom=0;
                break;
        }                    //При невалиден град или обем на продажбите (отрицателно число) да се отпечата "error".

        if (tradeCom == 0 ) {              //100/100    ; if (volumeSold < 0) -> 94/100
            System.out.println("error");
        }
        else {
            System.out.printf("%.2f", tradeCom);
        }
        /*
        1. Ако бъде въведен невалиден град, няма да влезем в нито един от трите случая за град и комисионната остава 0, а така и трябва => изписваме "error".
2. Ако бъде въведен невалиден (отрицателен) обем на продажбите, може да влезем в някой от трите случая за град, но няма да влезем в нито една от проверките за обем на продажбите и в такъв случай комисионната пак остава 0, което е напълно логично => изписваме "error".
Така покриваме и двата случая за невалиден вход - било то град или обем на продажбите, или и двете. При всяка една комбинация комисионната трябва да остане 0.

         */
    }
}
