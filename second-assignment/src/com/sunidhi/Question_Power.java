//take two numbers as input a number and power and calculate the exponent

package com.sunidhi;

import java.util.Scanner;

public class Question_Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the power: ");
        int pow = input.nextInt();
        int result = 1;

        for (int i = 1; i<=pow; i++){

            result = result * num;
        }
        System.out.println("The result of " + num + " to the power " + pow + " is " +  result);

    }
}
