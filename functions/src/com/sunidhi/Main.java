package com.sunidhi;

import java.util.Scanner;

public class Main {
    public static void main(java.lang.String[] args) {
//        int ans = sum2();
//        System.out.println("The sum is: " + ans);

        int ans = sum3(20, 30);
        System.out.println(ans);


    }

    // pass the value of function when you are calling the method in main
    // input given above while calling
    static int sum3(int a, int b){
        int sum_ = a + b;
        return sum_;
    }


    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter no. 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum; // nothing will execute after this statement
    }

    /*

        return_type name(){
            // body
            return statement;
        }

     */

    }

