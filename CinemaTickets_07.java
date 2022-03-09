package BASIC.NestedLoopsLab;

import java.util.Scanner;

public class CinemaTickets_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int totalCount = 0;
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;
        int currentMovieCount = 0;

        while (!movieName.equals("Finish")) {
            //Трябва да прочетем местата след влизането в първия while, защото също така трябва да можем да ги прочетем повече от веднъж
            int freeChairs = Integer.parseInt(scanner.nextLine());
            String movieType = ""; //("student", "standard", "kid")

            while (!movieType.equals("End")) {  // !!! && otherwise will stop after the "End"
                movieType = scanner.nextLine();  //variable movieType is changed in the While

                if (movieType.equals("student")) {
                    studentCount++;
                    totalCount++;
                    currentMovieCount++;
                } else if (movieType.equals("standard")) {
                    standardCount++;
                    totalCount++;
                    currentMovieCount++;
                } else if (movieType.equals("kid")) {
                    kidCount++;
                    totalCount++;
                    currentMovieCount++;
                }
                if (currentMovieCount >= freeChairs) {
                    break;
                }
            }
            double occupied = currentMovieCount * 1.0 / freeChairs * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, occupied);
            currentMovieCount = 0;    // !!! we need the counter to be Zero before the next movie to be read!!!

            movieName = scanner.nextLine();
        }
        int allTickets = studentCount + standardCount + kidCount;

        double studentPercent = studentCount * 1.0 / allTickets * 100;
        double standardPercent = standardCount * 1.0 / allTickets * 100;
        double kidPercent = kidCount * 1.0 / allTickets * 100;

        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", studentPercent);
        System.out.printf("%.2f%% standard tickets.%n", standardPercent);
        System.out.printf("%.2f%% kids tickets.", kidPercent);


    }
}
