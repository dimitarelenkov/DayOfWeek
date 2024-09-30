package tests;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangesQuantity = Double.parseDouble(scanner.nextLine());
        double raspberriesQuantity = Double.parseDouble(scanner.nextLine());
        double strawberriesQuantity = Double.parseDouble(scanner.nextLine());

        double priceForRaspberries = strawberriesPrice / 2;
        double priceForOranges = priceForRaspberries - priceForRaspberries * 0.40;
        double priceForBananas = priceForRaspberries - priceForRaspberries * 0.80;

        double sumForRaspberries = raspberriesQuantity * priceForRaspberries;
        double sumForOranges = orangesQuantity * priceForOranges;
        double sumForBananas = bananasQuantity * priceForBananas;
        double sumForStrawberries = strawberriesQuantity * strawberriesPrice;

        double totalSum = sumForRaspberries + sumForOranges + sumForBananas + sumForStrawberries;

        System.out.printf("%.2f", totalSum);
    }
}
