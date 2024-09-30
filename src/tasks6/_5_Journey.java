package tasks6;

import java.util.Scanner;

public class _5_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = budget;

        if (budget <= 100) {
            if (season.equals("summer")) {
               price *= 1.30;
            }
            else if (season.equals("winter")) {
               price *= 1.70;

            }
            System.out.println("Somewhere in Bulgaria");
        }
        else if (budget <= 1000) {
            if (season.equals("summer")) {
               price  *= 1.40;
            }
            else if (season.equals("winter")) {
               price  *= 1.80;

            }
            System.out.println("Somewhere in Balkans");

        }
        else {
           price  *= 1.90;

            System.out.println("Somewhere in Europe");
            double diff = price - budget;
            System.out.printf("Hotel - %.2f", diff);
            return;

        }
        double diff = price - budget;
        if (season.equals("summer")) {
            System.out.printf("Camp - %.2f", diff);
        }
        else {
            System.out.printf("Hotel - %.2f", diff);
        }



    }
}
