package tests;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int countOfHours = Integer.parseInt(scanner.nextLine());
        int countOfPeople = Integer.parseInt(scanner.nextLine());
        String daysWeather = scanner.nextLine();

        double sum = 0;
        double totalPrice = 0;

        if (month.equals("march") || month.equals("april") || month.equals("may")) {
            if (daysWeather.equals("day")) {
                sum = 10.50;
            }
            else if (daysWeather.equals("night")) {
                sum = 8.40;
            }
        }
        else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            if (daysWeather.equals("day")) {
                sum = 12.60;
            }
            else if (daysWeather.equals("night")) {
                sum = 10.20;
            }
        }

        if (countOfPeople >= 4) {
            sum *= 0.90;
        }
        if (countOfHours >= 5) {
            sum *= 0.50;
        }
        totalPrice = sum * countOfPeople * countOfHours;
        System.out.printf("Price per person for one hour: %.2f%n", sum);
        System.out.printf("Total cost of the visit: %.2f", totalPrice);
    }
}
