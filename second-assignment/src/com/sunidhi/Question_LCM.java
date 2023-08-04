package com.sunidhi;

import java.util.Scanner;

public class Question_LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();

        int hcf = 0;

        for (int i = 1; i <= num1 || i <= num2 ; i++) {
            if (num1 % i == 0 && num2 % i == 0){
                hcf = i;

            }
        }
        int lcm = (num1 * num2)/hcf;
        System.out.println("The LCM of the given two numbers is: " + lcm);
    }
}
