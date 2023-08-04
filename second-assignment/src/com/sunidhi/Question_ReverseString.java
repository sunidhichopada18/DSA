package com.sunidhi;

import java.util.Scanner;

public class Question_ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next().trim();

        int totalLength = word.length();
        String result = "";

        for (int i = 0; i <= totalLength - 1; i++) {
             char letter = word.charAt(i);
             result = letter + result;


        }
        if (word.equalsIgnoreCase(result)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }

        System.out.println(result);
    }
}
