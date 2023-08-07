//No. of Even Numbers

package com.sunidhi;

import java.util.Scanner;

public class Question_NoOfEvenno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int num = input.nextInt();

       int rem = num % 10;
        System.out.println(rem);
    }
}
