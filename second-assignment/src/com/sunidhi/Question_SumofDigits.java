package com.sunidhi;

import java.util.Scanner;

public class Question_SumofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int numCopy = num;

        int result = 0;
        while (num>0){
            int rem = num % 10;
            result = result + rem;

            num/=10;



        }

        System.out.println("The sum of digits of " + numCopy + " is: " + result);
    }
}
