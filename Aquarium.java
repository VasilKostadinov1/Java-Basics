package BASIC.First;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = length * width * height;
        double volumeInLitres = volume / 1000;
        double occupiedSpace = percent / 100;
        double neededLitres = volumeInLitres * (1 - occupiedSpace);
        System.out.printf("%.5f", neededLitres);


    }
}
