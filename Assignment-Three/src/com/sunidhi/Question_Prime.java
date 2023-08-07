package com.sunidhi;

import javax.script.ScriptEngine;
import java.util.Scanner;

public class Question_Prime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        String ans = isPrime(num);
        System.out.println("The number " + num +" " + ans);


    }

    static String isPrime(int num) {

        if (num <= 1){
            return "is non prime";
        }


        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return "is non prime";
            }
        }

        return "is prime";

    }
}
