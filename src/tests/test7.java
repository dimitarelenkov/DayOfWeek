package tests;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airlineName = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int childTickets = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double serviceFee = Double.parseDouble(scanner.nextLine());


        double childTicketPrice = Math.abs(0.7 * adultTicketPrice - adultTicketPrice);

        double totalAdultTicketPrice = adultTicketPrice + serviceFee;
        double totalChildTicketPrice = childTicketPrice + serviceFee;

        double totalProfit = (childTickets * totalChildTicketPrice) + (adultTickets * totalAdultTicketPrice);
        double agencyProfit = 0.2 * totalProfit;


        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airlineName, agencyProfit);

    }
}
