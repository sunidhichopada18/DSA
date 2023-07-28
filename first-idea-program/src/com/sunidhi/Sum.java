package com.sunidhi;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        // if we write float but input an integer,
        // it doesn't give error rather it
        // converts the output to float
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " + sum );
    }
}



