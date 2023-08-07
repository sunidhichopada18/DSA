package com.sunidhi;

import java.util.Scanner;

public class Question_pythorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int a = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = input.nextInt();
        System.out.print("Enter the 3rd number: ");
        int c = input.nextInt();

        boolean result = pythogorial(a, b, c);
        System.out.println(result);
    }

    static boolean pythogorial(int num1, int num2, int num3 ){
        int large = Math.max(num3, Math.max(num1, num2));
        if (num1 == large && Math.pow(num1, 2) == Math.pow(num2, 2) + Math.pow(num3, 2)){
            return true;
        }
        if (num2 == large && Math.pow(num2, 2) == Math.pow(num1, 2) + Math.pow(num3, 2)){
            return true;
        }
        if (num3 == large && Math.pow(num3, 2) == Math.pow(num1, 2) + Math.pow(num2, 2)){
            return true;
        }
        return false;
    }
}
