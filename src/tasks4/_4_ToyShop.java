package tasks4;

import java.util.Scanner;

public class _4_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());


        double countOfToys = puzzleCount + doll + teddyBear + minions + truck;

        double sum = (puzzleCount * 2.60) + (doll * 3.0)
                + (teddyBear * 4.10) + (minions * 8.20)
                + (truck * 2.00);

        if (countOfToys >= 50) {
            sum = sum - ( sum * 0.25);
        }

        sum = sum * 0.90;

        double diff = Math.abs(sum - excursionPrice);
        if (sum >= excursionPrice) {

            System.out.printf("Yes! %.2f lv left.", diff);
        }
         else{
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }



    }
}
