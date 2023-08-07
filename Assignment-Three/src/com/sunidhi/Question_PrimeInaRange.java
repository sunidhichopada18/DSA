package com.sunidhi;

import java.util.Scanner;

public class Question_PrimeInaRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        isPrime(num1, num2);
    }
    static void isPrime(int a, int b) {

        for (int i = a; i <= b; i++) {
            if (i == 1){
                i+=1;
            }
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime == true){
                System.out.print(i + " ");
            }

        }
    }
}