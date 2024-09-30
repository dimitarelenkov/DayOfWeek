package tests;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double eatenFoodQuantity = Double.parseDouble(scanner.nextLine());
        double catFoodCount = 0;
        double dogFoodCount = 0;
        double sum = 0;

        for (int i = 1; i <= days ; i++) {
            int foodForDogQuantity = Integer.parseInt(scanner.nextLine());
            int foodForKatQuantity = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                sum = sum + (foodForDogQuantity + foodForKatQuantity) * 0.10;

            }

            dogFoodCount += foodForDogQuantity;
            catFoodCount += foodForKatQuantity;

        }

        double sumAllEatenFood = dogFoodCount + catFoodCount;

        double percentageEatenFood = (sumAllEatenFood / eatenFoodQuantity) * 100;
        double percentageEatenFoodByDog = (dogFoodCount / sumAllEatenFood) * 100;
        double percentageEatenFoodByCat = (catFoodCount / sumAllEatenFood) * 100;

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(sum));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentageEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n",percentageEatenFoodByDog);
        System.out.printf("%.2f%% eaten from the cat.", percentageEatenFoodByCat);



    }
}
