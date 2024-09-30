package tasks8;

import java.util.Scanner;

public class _4_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int birthdayMoney = 10;
        int toy = 0;

        for (int i = 1; i <= n ; i++) {

            if (i % 2 == 0) {
                sum += birthdayMoney;
                birthdayMoney += 10;
                sum--;
            }
            else {
                toy++;
            }
        }
        int ToysCount = toy * toyPrice;
       sum += ToysCount;

        double diff = Math.abs(sum - washingMachine);
        if (sum >= washingMachine) {
            System.out.printf("Yes! %.2f ", diff);
        }
        else {
            System.out.printf("No! %.2f", diff);
        }

    }
}
