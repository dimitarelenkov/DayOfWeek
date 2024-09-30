package tasks12;

import java.util.Scanner;

public class _6_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int allTickets = 0;
        int studentCounter = 0;
        int standardCounter = 0;
        int kidCounter = 0;

        while (!command.equals("Finish")) {
            String movieName = command;
            int FreeSeats = Integer.parseInt(scanner.nextLine());
            int ticketsCounter = 0;


            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {
                switch (ticketType) {
                    case "student":
                        studentCounter++;
                        break;
                    case "standard":
                        standardCounter++;
                        break;
                    case "kid":
                        kidCounter++;
                        break;
                }

                ticketsCounter++;
                allTickets ++;
                if (ticketsCounter >= FreeSeats) {
                    break;
                }

                ticketType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movieName, 1.0 * ticketsCounter/ FreeSeats * 100);
            command = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", 1.0 * studentCounter / allTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n",1.0 * standardCounter / allTickets * 100);
        System.out.printf("%.2f%% kids tickets.",1.0 * kidCounter / allTickets * 100);
    }
}
