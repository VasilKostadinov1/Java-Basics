package BASIC.First;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int total =pages/ pagesPerHour;
        int totalPerDay = total/ days;
        System.out.println(totalPerDay);
    }
}
