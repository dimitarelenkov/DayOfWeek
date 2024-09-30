package tasks4;

import java.util.Scanner;

public class _2_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (n <= 100) {
            bonus = 5;
        }
        else if (n > 1000) {
            bonus = n * 0.10;
        }
        else {
            bonus = n * 0.20;
        }

        if (n % 2 == 0) {
            bonus = bonus + 1;
        }
        else if (n % 10 == 5) {
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(n + bonus);

    }
}
