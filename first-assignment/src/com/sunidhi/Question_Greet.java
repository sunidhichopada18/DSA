// Take name as input and print a greeting message for that particular name

package com.sunidhi;

import java.util.Scanner;

public class Question_Greet {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String name = in.next();
        //String name = in.nextLine().trim(); //removes the extra void spaces.

        System.out.println("Good morning " + name);

    }
}
