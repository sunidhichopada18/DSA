package com.sunidhi;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.print("Enter a valid operator: ");
            char operator = input.next().trim().charAt(0);

            System.out.print("Enter a valid number1: ");
            float num1 = input.nextFloat();
            System.out.print("Enter a valid number2: ");
            float num2 = input.nextFloat();

            float result = 0;
            if (operator == '+') {
                result = num1 + num2;


            } else if (operator == '-') {
                if (num1 > num2) {
                    result = num1 - num2;
                } else {
                    result = num2 - num1;
                }


            } else if (operator == '*') {
                result = num1 * num2;


            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("num2 = 0, therefore no valid result");
                } else {
                    result = num1 / num2;
                }


            } else if (operator == '%') {
                result = num1 % num2;
            } else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Invalid Operator");
            }


            if ((result * 10) % 10 == 0) {
                System.out.println("The result of the given operation is: " + (int) (result));
            } else {
                System.out.print("The result of the given operation is: " + result);
            }
        }
    }
}