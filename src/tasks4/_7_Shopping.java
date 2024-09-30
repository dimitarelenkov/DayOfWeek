package tasks4;

import java.util.Scanner;

public class _7_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numOfVideoCarts = Integer.parseInt(scanner.nextLine());
        int numOfProcessor = Integer.parseInt(scanner.nextLine());
        int numOfRamMemory= Integer.parseInt(scanner.nextLine());

        int priceForVideoCarts = numOfVideoCarts * 250;

        double priceForProcessor = priceForVideoCarts - (priceForVideoCarts * 0.65);
        double sumForProcessor = priceForProcessor * numOfProcessor;

        double priceForRamMemory =  priceForVideoCarts - (priceForVideoCarts * 0.90);
        double sumForRamMemory = priceForRamMemory * numOfRamMemory;

        double totalPrice = priceForVideoCarts + sumForProcessor + sumForRamMemory;

        if (numOfVideoCarts > numOfProcessor){

            totalPrice = totalPrice - (totalPrice * 0.15);
        }

        double diff = Math.abs(budget - totalPrice);

        if (totalPrice <= budget) {

            System.out.printf("You have %.2f leva left!", diff);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }



    }
}
