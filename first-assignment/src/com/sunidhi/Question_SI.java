// Write a program to take input principle, time and rate from user and find simple interest

package com.sunidhi;

import java.util.Scanner;

public class Question_SI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the Principle: ");
        float p = input.nextFloat();
        System.out.print("Enter the Rate of Interest: ");
        float r = input.nextFloat();
        System.out.print("Enter the Time: ");
        float t = input.nextFloat();

        float si = (p * r * t) / 100;

        System.out.println("The SI is " + si);
    }
}
