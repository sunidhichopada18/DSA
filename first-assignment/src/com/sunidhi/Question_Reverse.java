package com.sunidhi;

import java.util.Scanner;

public class Question_Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int result = 0;
//
//        while (num>0){
//
//            int rem = num % 10;
//            result = result * 10 + rem;
//
//            num/=10;
//
//        }
//        System.out.print(result);
//



        String word = input.next().trim();
        int lenghtOfWord = word.length();
        String result = "";

        for (int   i = lenghtOfWord - 1 ; i >= 0; i-- ) {
            result = result + word.charAt(i);

        }
        System.out.print(result);









    }
}




