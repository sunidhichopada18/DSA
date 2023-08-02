package com.sunidhi;

import java.util.Scanner;

public class Question_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a valid String/Number: ");
        String str = input.next().trim();
        int totaldigits = str.length();
        String result = "";


        for (int i = totaldigits - 1; i >= 0; i--) {
            result =  result + str.charAt(i);
        }
        System.out.println("The result is " + result);

        if (result.equalsIgnoreCase(str)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}
