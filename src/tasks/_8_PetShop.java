package tasks;

import java.util.Scanner;

public class _8_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogBox = Integer.parseInt(scanner.nextLine());
        int catBox = Integer.parseInt(scanner.nextLine());

        System.out.printf("%f lv.", (dogBox * 2.50 + catBox * 4));
    }
}
