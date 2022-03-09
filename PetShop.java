package BASIC.FirstStepsLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogPack = Integer.parseInt(scanner.nextLine());
        int catPack = Integer.parseInt(scanner.nextLine());

        double dogTotal = dogPack*2.50;
        double catTotal = catPack*4.0;
        double finalTotal = dogTotal+catTotal;

        System.out.printf("%.1f lv.", finalTotal);
    }
}
