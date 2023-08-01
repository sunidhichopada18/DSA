//Take two numbers as input and print the largest number.

package com.sunidhi;

import java.util.Scanner;

public class Question_LargeNo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float Num_1 = input.nextFloat();

        System.out.print("Enter the second number: ");
        float Num_2 = input.nextFloat();

        float result = 0;
        if (Num_1 > Num_2){
            result = Num_1;
        }else {
            result = Num_2;
        }
        if (result % 1 ==0){
            System.out.println("The largest number is: " + (int)(result));
        }else{
            System.out.println("The largest number is: " + result);
        }



    }
}
// int largest = Math.max(num1, num2)