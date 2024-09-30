package tasks6;

import java.util.Scanner;

public class _4_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupBudget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersCont = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

       if (season.equals("Spring")){
           price = 3000.0;
       }
       else if (season.equals("Summer") || season.equals("Autumn")) {
           price = 4200.0;
       }
       else if (season.equals("Winter")) {
           price = 2600.0;
       }


       if (fishersCont <= 6 ) {
           price *= 0.90;
       }
       else if (fishersCont <= 11) {
           price *= 0.85;
       }
       else {
           price *= 0.75;
       }
        if (fishersCont % 2 == 0 && !season.equals("Autumn")){
            price *= 0.95;

        }
        double diff = Math.abs(price - groupBudget);
        if (groupBudget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }

    }
}
