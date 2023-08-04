
//take integer inputs till the user enters 0 and print the sum of all numbers (hint while loop)

package com.sunidhi;

import java.util.Scanner;

public class Question_SumOfAllInputnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        int result = 0;


        while (true){

             int a = input.nextInt();
             result = result + a;
             if (a == 0)
                 break; //alt shift d + arrow


        }
        System.out.println(result);

    }
}
