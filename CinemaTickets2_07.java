package BASIC.NestedLoopsLab;

import java.util.Scanner;

public class CinemaTickets2_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int countStudent = 0;
        int countStandard = 0;
        int countKid = 0;
        int currentMovieCount = 0;    // counter per Film

        while (!movieName.equals("Finish")) {  //Трябва да прочетем местата след влизането в първия while, защото също така трябва да можем да ги прочетем повече от веднъж
            int freeSeats = Integer.parseInt(scanner.nextLine());

            //String movieType = ""; //("student", "standard", "kid")

            while ( currentMovieCount < freeSeats) {
                String movieType = scanner.nextLine(); //declare movieType in the while!!!
                if (movieType.equals("student")) {
                    countStudent++;
                    currentMovieCount++;

                } else if (movieType.equals("standard")) {
                    countStandard++;
                    currentMovieCount++;

                } else if (movieType.equals("kid")) {
                    countKid++;
                    currentMovieCount++;
                }
                if (movieType.equals("End")){
                    break;                     // break!!!
                }
            }
            double occupied = currentMovieCount * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, occupied);
            currentMovieCount = 0;    // !!! otherwise not reading all after the "movie names"

            movieName = scanner.nextLine();
        }
        int allTickets = countStudent + countStandard + countKid;

        double studentPercent = countStudent * 1.0 / allTickets * 100;
        double standardPercent = countStandard * 1.0 / allTickets * 100;
        double kidPercent = countKid * 1.0 / allTickets * 100;

        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", studentPercent);
        System.out.printf("%.2f%% standard tickets.%n", standardPercent);
        System.out.printf("%.2f%% kids tickets.", kidPercent);

    }
}
