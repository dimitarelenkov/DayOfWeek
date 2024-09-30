package tasks6;

import java.util.Scanner;

public class _3_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (flowers.equals("Roses")) {
            price = flowersCount * 5.0;

            if (flowersCount > 80) {
                price *= 0.90;
            }
        }
        else if (flowers.equals("Dahlias")) {
            price = flowersCount * 3.80;

            if (flowersCount > 90) {
                price *= 0.85;
            }
        }
        else if (flowers.equals("Tulips")) {
            price = flowersCount * 2.80;

            if (flowersCount > 80) {
                price *= 0.85;
            }
        }
        else if (flowers.equals("Narcissus")) {
            price = flowersCount * 3.0;

            if (flowersCount < 120) {
                price *= 1.15;
            }
        }
        else if (flowers.equals("Gladiolus")) {
            price = flowersCount * 2.50;

            if (flowersCount < 80) {
                price *= 1.20;
            }

        }
        double finalPrice = Math.abs(price - budget);
        if (price <= budget) {
            System.out.printf("Hey, you have a great garden " +
                    "with %d %s and %.2f leva left.", flowersCount, flowers, finalPrice );
        }
        else {

            System.out.printf("Not enough money, you need %.2f leva more.", finalPrice);
        }
    }
}
