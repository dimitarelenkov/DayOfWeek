package tasks5;

import java.util.Scanner;

public class _5_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String products = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());



        if ("Sofia".equals(city)) {
            if ("coffee".equals(products)) {
                quantity *= 0.50;
            }
            else if ("water".equals(products)) {
                quantity *= 0.80;
            }
            else if ("beer".equals(products)) {
                quantity *= 1.20;
            }
            else if ("sweets".equals(products)) {
                quantity *= 1.45;
            }
            else if ("peanuts".equals(products)) {
                quantity *= 1.60;
            }
        }
       else if ("Plovdiv".equals(city)) {
            if ("coffee".equals(products)) {
                quantity *= 0.40;
            }
            else if ("water".equals(products)) {
                quantity *= 0.70;
            }
            else if ("beer".equals(products)) {
                quantity *= 1.15;
            }
            else if ("sweets".equals(products)) {
                quantity *= 1.30;
            }
            else if ("peanuts".equals(products)) {
                quantity *= 1.50;
            }
        }
        else if ("Varna".equals(city)) {
            if ("coffee".equals(products)) {
                quantity *= 0.45;
            }
            else if ("water".equals(products)) {
                quantity *= 0.70;
            }
            else if ("beer".equals(products)) {
                quantity *= 1.10;
            }
            else if ("sweets".equals(products)) {
                quantity *= 1.35;
            }
            else if ("peanuts".equals(products)) {
                quantity *= 1.55;
            }
        }
        System.out.println(quantity);

    }
}
