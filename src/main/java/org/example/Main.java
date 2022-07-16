package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Main aKeyboardScanner = new Main();
            aKeyboardScanner.runScanner();
        }

        private void runScanner() {
            int    num1;
            double num2;
            double sum;
            String name;

            Scanner in = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            num1 = in.nextInt();

            System.out.print("Enter a floating point number: ");
            num2 = in.nextDouble();

            System.out.print("Enter your name: ");
            name = in.next();

            sum = num1 + num2;
            System.out.printf("Hi! %1$s, the sum of %2$d and %3$.5f is %4$.5f \n"
                    , name, num1, num2, sum);
    }
}