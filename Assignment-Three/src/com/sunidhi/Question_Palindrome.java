package com.sunidhi;

import java.util.Scanner;

public class Question_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String/Number: ");
        String name = input.next();

        String ans = palindrome(name);

        if (ans.equalsIgnoreCase(name)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }

    }
    static String palindrome(String name){
        int totalength = name.length();
        String result = "";
        for (int i = totalength - 1; i >= 0  ; i--) {
            char letter = name.charAt(i);
            result = result + letter;
        }
        return result;
    }

}
