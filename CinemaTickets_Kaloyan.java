package BASIC.NestedLoopsExercises;

import java.util.Scanner;

public class CinemaTickets_Kaloyan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int totalTickets = 0;
        int kids = 0;
        int standard = 0;
        int student = 0;

        while (!input.equals("Finish")) {           //1st while
            int places = Integer.parseInt(scanner.nextLine());
            int currentTickets = 0;   // only for the current film

            String ticket = scanner.nextLine();
            while (!ticket.equals("End")) {        //2nd while
                currentTickets++;
                totalTickets++;
                // student , standard , kid
                switch (ticket) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kids++;
                        break;
                }
                if (currentTickets >= places) {  // ! >=  // check in the 2nd while, as needed per film check
                    break;
                }
                ticket = scanner.nextLine();  // variable "ticket" is changed in the while
            }
            System.out.printf("%s - %.2f%% full.%n", input, currentTickets * 1.0 / places * 100);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", student * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kids * 1.0 / totalTickets * 100);

    }
}
