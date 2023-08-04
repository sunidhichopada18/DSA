// Factorial program in java

package com.sunidhi;

import java.util.Scanner;

public class Question_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int fact = input.nextInt();

        int product = 1;

        for (int i = 1; i <= fact; i++ ){
            product *= i;
        }
        System.out.println("The Factorial of " + fact + " is "+ product);
    }
}
