package com.sunidhi;

import java.util.Scanner;

public class Question_LargeSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();

        int maxValue = funL(a, b, c);
        int minValue = funS(a, b, c);

        System.out.println("The maximum value is: " + maxValue);
        System.out.println("The minimum value is: " + minValue);
    }
    static int funL(int a, int b, int c) {
        int maximum = a;
        if (b > maximum) {
            maximum = b;
        }
        if (c> maximum){
            maximum = c;
        }
        return maximum;
    }
    static int funS(int a, int b, int c){
       int minimum = a;
       if (b < minimum){
           minimum = b;
       }
       if (c < minimum){
           minimum = c;
       }
       return minimum;
    }
}
