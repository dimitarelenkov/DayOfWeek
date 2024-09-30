package tasks11;

import java.util.Scanner;

public class _4_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while (!destination.equals("End")) {

            double needMoney = Double.parseDouble(scanner.nextLine());
            double saveMoney = Double.parseDouble(scanner.nextLine());

            while (saveMoney < needMoney) {
                double sumForSave = Double.parseDouble(scanner.nextLine());
                saveMoney += sumForSave;
            }
            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }
    }
}
