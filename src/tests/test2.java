package tests;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfNights = Integer.parseInt(scanner.nextLine());
        double priceForNight = Double.parseDouble(scanner.nextLine());
        int percentForExp = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        double sumForNight = 0;


        if (numberOfNights > 7) {
             sumForNight = priceForNight - (priceForNight * 0.05);
            sumForNight = sumForNight * numberOfNights;
        }
        else {
            sumForNight = numberOfNights * priceForNight;
        }

        double budgetPrice =  (budget * percentForExp / 100);
        double sum = sumForNight + budgetPrice;

        if (sum <= budget ) {
            totalSum = budget - sum;
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", totalSum);
        }
        else {
            System.out.printf("%.2f leva needed.", sum - budget);
        }
    }
}
