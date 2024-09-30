package tasks10;

import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyForTour = Double.parseDouble(scanner.nextLine());
        double herMoney = Double.parseDouble(scanner.nextLine());

        int daysCounter = 0;
        int spendingCounter = 0;

        while (herMoney < moneyForTour && spendingCounter < 5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCounter++;

            if (command.equals("save")) {
                herMoney += money;
                spendingCounter = 0;
            } else if (command.equals("spend")) {
                herMoney -= money;
                spendingCounter += 1;
                if (herMoney < 0) {
                    herMoney = 0;
                }
            }
        }
        if (spendingCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        }
        if (herMoney >= moneyForTour) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }

    }
}
