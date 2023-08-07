//write a program to print the factorial of a number by defining a method named "Factorial"


package com.sunidhi;

import java.util.Scanner;

public class Question_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int result = factorial(num);
        System.out.println("The factorial of " + num + " is " + result);


    }
    static int factorial(int num){
        int product = 1;
        for (int i = 1; i <= num ; i++) {
            product = product * i;
        }
        return product;
    }

}
