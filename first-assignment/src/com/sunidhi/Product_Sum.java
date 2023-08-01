
//Given an integer number n return the difference between the product of its digit and the sum of its digit


package com.sunidhi;

import java.util.Scanner;

public class Product_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int totalDigits = Integer.toString(num).length();

        int sum = 0;
        int product = 1;

        for (int i = 0; i < totalDigits ; i++){

            int digit = num % 10;

            product = digit * product;

            sum = digit + sum;

            num /= 10;

        }
        int result = product - sum;

        System.out.println(result);
    }
}
