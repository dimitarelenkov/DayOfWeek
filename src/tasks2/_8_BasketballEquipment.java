package tasks2;

import java.util.Scanner;

public class _8_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualFee = Integer.parseInt(scanner.nextLine());

        double sneakers = annualFee - (annualFee * 0.40);
        double set =  sneakers - (sneakers * 0.20);
        double ball = set * 1/4;
        double access  = ball * 1/5;

        double finalPrice = annualFee + sneakers + set + ball + access;
        System.out.println(finalPrice);
    }
}
