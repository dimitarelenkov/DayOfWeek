package tests;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beerCount = Integer.parseInt(scanner.nextLine());
        int snacksCount = Integer.parseInt(scanner.nextLine());

        double totalPriceForBeer = 1.20 * beerCount;
        double priceForOneSnacks = totalPriceForBeer * 0.45;
        double totalPriceForSnacks = Math.ceil(priceForOneSnacks * snacksCount);
        double totalSum = totalPriceForBeer + totalPriceForSnacks;
        if (totalSum <= budget) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, budget - totalSum);
        }
        else {
            System.out.printf("%s needs %.2f more leva!", name, totalSum - budget);
        }
    }
}
