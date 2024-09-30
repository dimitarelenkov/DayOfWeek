package tasks2;

import java.util.Scanner;

public class _5_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pensCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int detergenLiters = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double pensPrice = pensCount * 5.80;
        double markersPrice = markersCount * 7.20;
        double detergenPrice = detergenLiters * 1.20;
        double totalPrice = pensPrice + markersPrice + detergenPrice;
        double finalPrice = totalPrice - (totalPrice * discountPercent / 100);
        System.out.println(finalPrice);
    }
}
