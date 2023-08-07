//define a program to find out whether a given number is even or odd

package com.sunidhi;

import java.util.Scanner;

public class Question_EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
//        boolean result = isEven(num);
        String result = isEven(num);

        System.out.println(num + " is an " + result+ " number");

//        if (result == true){
//            System.out.println(num + " is an even number");
//
//        } else {
//            System.out.println(num + " is an odd number");
//        }




    }
//    static boolean isEven(int a) {
//        if (a % 2 == 0) {
//            return true;
//
//        }
//        return false;
//    }



    static String isEven(int a) {
        if (a % 2 == 0) {
            return "even";

        }
        return "odd";
    }
}
