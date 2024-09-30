package tasks5;

import java.util.Scanner;

public class _10_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 100 && n <= 200 || n == 0) {
            System.out.println(" ");
        }
        else {
            System.out.println("invalid");
        }
    }
}
