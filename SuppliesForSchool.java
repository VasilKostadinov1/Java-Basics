package BASIC.First;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pen = Integer.parseInt(scanner.nextLine());
        int marker = Integer.parseInt(scanner.nextLine());
        double cleaner = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double pricePen = pen*5.80;
        double priceMarkers = marker*7.20;
        double priceCleaner = cleaner*1.20;
        double totalWithout = pricePen+priceMarkers+priceCleaner;
        double totalWithDiscount = totalWithout - totalWithout*discount/100;
        System.out.println(totalWithDiscount);
    }

}
