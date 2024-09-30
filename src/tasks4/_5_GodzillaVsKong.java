package tasks4;

import java.util.Scanner;

public class _5_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetForMovie = Double.parseDouble(scanner.nextLine());
        int countOfExtras = Integer.parseInt(scanner.nextLine());
        double priceForClothing = Double.parseDouble(scanner.nextLine());

        double priceForDecor = budgetForMovie * 0.10;
        double priceForExtrasClothing = countOfExtras * priceForClothing;

        if (countOfExtras > 150) {
            priceForExtrasClothing = priceForExtrasClothing - (priceForExtrasClothing * 0.10);
        }




        double totalPriceForMovie = priceForDecor + priceForExtrasClothing;
        double diff = Math.abs(totalPriceForMovie - budgetForMovie);

        if (totalPriceForMovie > budgetForMovie) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff );
        }
        else if (totalPriceForMovie <= budgetForMovie) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }

    }
}
