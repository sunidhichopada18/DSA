
// check whether the given number is Amstrong number!

package com.sunidhi;

import java.util.Scanner;

import static java.lang.Math.*;

public class Question_Amstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num = input.nextInt();
        int numcopy = num;
        int totalDigits = Integer.toString(num).length();
        int sum = 0;
        for (int i = 0; i<=totalDigits; i++){
            int digit = num % 10;
            sum = (int)(sum + Math.pow(digit, totalDigits));
            num/=10;

        }


        System.out.println(sum);
        if (numcopy == sum){
            System.out.println("it is an amstrong number");

        }else{
            System.out.println("it is not an amstrong number");
        }
    }
}