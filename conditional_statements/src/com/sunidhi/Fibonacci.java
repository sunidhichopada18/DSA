
// Find the nth fibonacci number

package com.sunidhi;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//
//        for (int count = 2; count<=n; count++) {
//            System.out.print(a + " ");
//            int temp = a;
//            a = b;
//            b = temp + b;
//
//        }

        int  k=0, a=0, b=1;
        System.out.print("0 1 ");
        while(k<=n){
            k=a+b;
            if (k>=n)
                break;
            System.out.print(k + " ");
            a=b;
            b=k;
        }

    }
}
