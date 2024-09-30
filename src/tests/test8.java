package tests;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double averageMovementSpeed = Double.parseDouble(scanner.nextLine());
        double litersFuel = Double.parseDouble(scanner.nextLine());

        double totalDistance = 384400 * 2;
        double timeToGoAndBack = Math.ceil(totalDistance / averageMovementSpeed);
        double totalTime = timeToGoAndBack + 3;
        double fuel = (litersFuel * totalDistance) / 100;

        System.out.println(Math.round(totalTime));
        System.out.println(Math.round(fuel));



    }
}
