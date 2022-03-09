package BASIC.ForCycleLab;

import java.util.Scanner;

public class VowelSum2_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //Softuni
        //отпечатваме символи -> позиции
        // начална стойност: 0
        // крайна стойност: дължина - 1  !!!
        int sum = 0;
        for (int position = 0; position <= text.length() - 1; position++) {
            char symbol = text.charAt(position);
            //проверки дали символа е: a e i o u
            switch (symbol) {
                case 'a':
                    sum += 1;
                    //sum = sum + 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }

        System.out.println(sum);
    }

}
