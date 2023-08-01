// to calculate fibonacci series upto n numbers


package com.sunidhi;

import java.util.Scanner;

public class Question_Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a vaild number: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;


        for (int count = 0; count<=n; count++){
            int temp = a;
            System.out.print(a + " ");
            a = b;
            b = temp + b;
        }
    }
}

