package tasks5;

import java.util.Scanner;

public class _11_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double num = Double.parseDouble(scanner.nextLine());

       if (day.equals("Monday")
               || day.equals("Tuesday")
               || day.equals("Wednesday")
               || day.equals("Thursday")
               || day.equals("Friday")) {


           if (fruit.equals("banana")) {
               num *= 2.50;
           }
           else if (fruit.equals("apple")) {
               num *= 1.20;
           }
           else if (fruit.equals("orange")) {
               num *= 0.85;
           }
           else if (fruit.equals("grapefruit")) {
               num *= 1.45;
           }
           else if (fruit.equals("kiwi")) {
               num *= 2.70;
           }
           else if (fruit.equals("pineapple")) {
               num *= 5.50;
           }
           else if (fruit.equals("grapes")) {
               num *= 3.85;
           }
           else {
               System.out.println("error");
               return;

           }

       }
       else if (day.equals("Saturday") || day.equals("Sunday")) {

           if (fruit.equals("banana")) {
               num *= 2.70;
           }
           else if (fruit.equals("apple")) {
               num *= 1.25;
           }
           else if (fruit.equals("orange")) {
               num *= 0.90;
           }
           else if (fruit.equals("grapefruit")) {
               num *= 1.60;
           }
           else if (fruit.equals("kiwi")) {
               num *= 3.00;
           }
           else if (fruit.equals("pineapple")) {
               num *= 5.60;
           }
           else if (fruit.equals("grapes")) {
               num *= 4.20;
           }
       }
       else {
           System.out.println("error");
           return;
       }

        System.out.printf("%.2f", num);


    }
}
