package BASIC.First;


import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fee = Integer.parseInt(scanner.nextLine());

        double snikkers = fee - fee*0.40;   // *1.0 !!!!!
        double kit = snikkers - snikkers*0.20;
        double ball = kit/4;
        double accessories = ball/5;
        double total = snikkers+kit+ball+accessories+fee;

        System.out.println(total);
    }

   }
