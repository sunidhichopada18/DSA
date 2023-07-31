package com.sunidhi;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
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
        System.out.println(" ");

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
            System.out.print(a + " ");
            a++;
        } while (a <= 5);
    }
}
