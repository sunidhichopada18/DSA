package com.sunidhi;

import java.util.Scanner;

public class Question_Even_Odd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();


        if (num % 2 == 0) {
            System.out.println("it is an even number!");
        } else {
            System.out.println("it is an odd number!");
        }
    }
}
