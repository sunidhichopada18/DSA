package com.sunidhi;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // find the largest of the three numbers

//        int max = a;
//
//        if (b > max){
//            max = b;
//        }
//
//        if (c > max) {
//            max = c;
//
//        }


        // method 2
//        int max = 0;
//        if (a>b){
//            max = s;
//        } else {
//            max = b;
//        }
//
//        if (c>max){
//            max = c;
//        }


        // Method 3

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

    }
}
