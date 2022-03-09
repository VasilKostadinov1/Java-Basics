package BASIC.ForCycleExercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    // 100/100

        int groups = Integer.parseInt(scanner.nextLine());  //– броя на групите от катерачи
        //String peak = "";
        int countMusala = 0;
        int countMonblan = 0;
        int countKili = 0;
        int countK2 = 0;
        int countEverest = 0;
        int total=0;

        for (int i = 1; i <=groups ; i++) {                //•	За всяка една група на отделен ред
            int personPerGroup = Integer.parseInt(scanner.nextLine());   //– броя на хората в групата
            total+=personPerGroup;
            if (personPerGroup<=5){
                countMusala+=personPerGroup;
            } else if (personPerGroup<=12){
                countMonblan+=personPerGroup;
            }else if (personPerGroup<=25){
                countKili+=personPerGroup;
            }else if (personPerGroup<=40){
                countK2+=personPerGroup;
            }else if (personPerGroup>=41){    // •	Група от 41 или повече човека – изкачват Еверест
                countEverest+=personPerGroup;
            }
        }
        double percentMusala = (double)countMusala*100/total;
        double percentMonblan = (double)countMonblan*100/total;
        double percentKili = (double)countKili*100/total;
        double percentK2 = (double)countK2*100/total;
        double percentEverest = (double)countEverest*100/total;

        System.out.printf("%.2f%%%n",percentMusala);
        System.out.printf("%.2f%%%n",percentMonblan);
        System.out.printf("%.2f%%%n",percentKili);
        System.out.printf("%.2f%%%n",percentK2);
        System.out.printf("%.2f%%%n",percentEverest);
    }
}
