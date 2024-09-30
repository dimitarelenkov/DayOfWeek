package tasks7;

import java.util.Scanner;

public class _9_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;

        for (int i = 1; i <= n; i++) {

            int number = Integer.parseInt(scanner.nextLine());
            leftSum += number;

        }
        int rightNum = 0;
        for (int i = 1; i <= n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            rightNum += number;
        }

        if (leftSum == rightNum) {
            System.out.println("Yes, sum = " + leftSum);
        }
        else {
            int diff = Math.abs(rightNum - leftSum);
            System.out.println("No, diff = " + diff);
        }
    }
}
