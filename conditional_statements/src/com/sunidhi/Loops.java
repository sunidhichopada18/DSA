package com.sunidhi;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Q: Print numbers from 1 to 5
        /*
            syntax of for loop

            for(initialization; condition; increment/decrement){
                    //body
            }
        */
        //Q: Print numbers from 1 to 5

        for(int num=1; num<=5; num++){
            System.out.print(num + " ");
        }
        System.out.println(" ");

        // Q2: print numbers incremented by 2

        for(int num=1; num<=5; num+=2){
            System.out.print(num + " ");
        }
        System.out.println(" ");

        // print numbers from 1 to n
        System.out.println("Please enter a value: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int num=1; num<=n; num++){
            System.out.print(num+ " ");
        }


        // While loops

        /*
            Syntax:
            while(condition){
                    //body
            }
        */

        System.out.println(" ");
        int num =1;
        while (num<=5){
            System.out.print(num + " ");
            num += 1;
        }

        /*
        do while loop

        do{
            //body
       }while(condition);

    even if the function is false but do while loop executes
    it at least once because it runs the do function first!
        */

        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a <= 5);
    }
}
