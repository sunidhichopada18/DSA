package com.sunidhi;

import java.util.Scanner;

public class Question_HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int hcf = 0;

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        System.out.println(hcf);





    }
}
