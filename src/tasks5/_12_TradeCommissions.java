package tasks5;

import java.util.Scanner;

public class _12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double n = Double.parseDouble(scanner.nextLine());
        double comission = 0;

        if (city.equals("Sofia")){
            if (n >= 0){
                if (n <= 500){
                    comission = 5;
                }
                else if (n <= 1000) {
                    comission = 7;
                }
                else if (n <= 10000) {
                    comission = 8;
                }
                else {
                    comission = 12;
                }
            }
            else {
                System.out.println("error");
                return;
            }
        }
        else if (city.equals("Varna")) {
            if (n >= 0){
                if (n <= 500){
                    comission = 4.5;
                }
                else if (n <= 1000) {
                    comission = 7.5;
                }
                else if (n <= 10000) {
                    comission = 10;
                }
                else {
                    comission = 13;
                }
            }
            else {
                System.out.println("error");
                return;
            }
        } else if (city.equals("Plovdiv")) {
            if (n >= 0){
                if (n <= 500){
                    comission = 5.5;
                }
                else if (n <= 1000) {
                    comission = 8;
                }
                else if (n <= 10000) {
                    comission = 12;
                }
                else {
                    comission = 14.5;
                }
            }
            else {
                System.out.println("error");
                return;
            }
        }
        else {
            System.out.println("error");
            return;
        }
        double price = (comission / 100) * n;

        System.out.printf("%.2f", price);
    }
}
