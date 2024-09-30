package tasks;

import java.util.Scanner;

public class _9_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        double secondNum = 7.61;

        double price = num * secondNum;
        double discount = 0.18;
        double priceForDiscount = discount * price;
        double finalPrice = price - priceForDiscount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + priceForDiscount + " lv.");
    }
}
