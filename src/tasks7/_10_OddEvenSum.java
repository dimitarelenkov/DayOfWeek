package tasks7;

import java.util.Scanner;

public class _10_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 0;
        int number1 = 0;

        for (int i = 1; i <= n ; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                number += currentNumber;
            }
            else {
                number1 += currentNumber;
            }

        }
        if (number == number1) {
            System.out.println("Yes");
            System.out.println("Sum = " + number);
        }
        else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(number - number1));
        }
    }
}
