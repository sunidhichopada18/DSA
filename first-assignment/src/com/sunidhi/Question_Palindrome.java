package com.sunidhi;

import java.util.Scanner;

public class Question_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String palinWo = input.next().trim();

        int strinLen = palinWo.length();
        String result = "";

//        for (int i = strinLen - 1; i>=0; i--){
//            result = result + palinWo.charAt(i);

        for (int i = 0; i<=strinLen-1; i++){
            result = palinWo.charAt(i) + result;

        }
        System.out.println(result);
        if (palinWo.equalsIgnoreCase(result)){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }

    }
}
