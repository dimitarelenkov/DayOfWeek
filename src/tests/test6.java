package tests;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());


        int firstStart = Integer.parseInt(Integer.toString(firstNum).substring(0,1));
        int secondStart = Integer.parseInt(Integer.toString(firstNum).substring(1,2));
        int thirdStart = Integer.parseInt(Integer.toString(firstNum).substring(2,3));
        int fourthStart = Integer.parseInt(Integer.toString(firstNum).substring(3,4));

        int firstEnd = Integer.parseInt(Integer.toString(secondNum).substring(0,1));
        int secondEnd = Integer.parseInt(Integer.toString(secondNum).substring(1,2));
        int thirdEnd = Integer.parseInt(Integer.toString(secondNum).substring(2,3));
        int fourthEnd = Integer.parseInt(Integer.toString(secondNum).substring(3,4));



        for (int i = firstStart; i <= firstEnd ; i++) {
            for (int j = secondStart; j <= secondEnd ; j++) {
                for (int k = thirdStart; k <= thirdEnd ; k++) {
                    for (int l = fourthStart; l <= fourthEnd ; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.print(i);
                            System.out.print(j);
                            System.out.print(k);
                            System.out.print(l);
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }
}
