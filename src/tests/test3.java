package tests;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;
        if (season.equals("Summer")) {
            switch (destination) {
                case "Dubai":
                    price = days * 40000 - (days * 40000) * 0.30;
                    break;
                case "Sofia":
                    price = days * 12500 + (days * 12500) * 0.25;
                    break;
                case "London":
                    price = days * 20250;
                    break;
            }
        }
        else if (season.equals("Winter")) {
            switch (destination) {
                case "Dubai":
                    price = days * 45000 - (days * 45000) * 0.30;
                    break;
                case "Sofia":
                    price = days * 17000 + (days * 17000) * 0.25;
                    break;
                case "London":
                    price = days * 24000;
                    break;
            }
        }

        if (price <= budget){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - price);
        }
        else {
            System.out.printf("The director needs %.2f leva more!", Math.abs(budget - price));
        }

    }
}
