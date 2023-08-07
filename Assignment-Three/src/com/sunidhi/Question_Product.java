package com.sunidhi;

import java.util.Scanner;

public class Question_Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();

        int result = product(a, b);
        System.out.println("The product of 2 numbers is " + result);

    }
    static int product(int a, int b){
        int ans = a * b;
        return ans;
    }


}
