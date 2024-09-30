package tasks12;

import java.util.Scanner;

public class _3_SuPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int sumPrimeNumbers = 0;
        int sumNonPrimeNumbers = 0;

        while (!command.equals("stop")) {
            int dividersCount = 0;

            int num = Integer.parseInt(command);
            for (int i = 1; i <= num ; i++) {
                if (num % i == 0) {
                    dividersCount++;
                }
            }
            if (num < 0) {
                System.out.printf("Number is negative.%n");
                command = scanner.nextLine();
                continue;
            }
            if (dividersCount > 2) {
                sumNonPrimeNumbers += num;
            }
            else {
                sumPrimeNumbers += num;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n" +
                "Sum of all non prime numbers is: %d", sumPrimeNumbers, sumNonPrimeNumbers);


    }
}
