package com.sunidhi;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String message = greet();
        System.out.println(message); // Output: "How are you?"

        System.out.print("Please Enter your name: ");
        String naam = input.next();

        String personalized = myGreet(naam);
        System.out.println(personalized); // Output: Hello <name>
    }

    static String greet(){
        String greeting = "How are you?";
        return greeting;
    }
    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
}