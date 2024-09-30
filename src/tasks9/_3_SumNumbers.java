package tasks9;

import java.util.Scanner;

public class _3_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < number ) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;
        }
        System.out.println(sum);
    }
}
