// Perfect Number

package com.sunidhi;

import java.util.Scanner;

public class Question_PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int perfectNum = input.nextInt();

        int sum = 0;
        for (int i = 1; i < perfectNum; i++) {
             if (perfectNum % i == 0){
                 sum = sum + i;
             }
        }

        System.out.println("The sum is " + sum);

        if (sum == perfectNum){
            System.out.println("The sum is " + sum + " of the perfect divisors of " + perfectNum   + ", it is a perfect no.");
        } else {
            System.out.println(sum + " is not equal to " + perfectNum + ", therefore it is not a perfect no.");
        }
    }
}
