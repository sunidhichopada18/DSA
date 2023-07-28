package com.sunidhi;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //system.out means display
        System.out.println("Hey how are you?");
        //take input from us, new keyword is constructor new object
        //system.in means keyboard
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());//integer as input
        System.out.println(input.next());//inputs the first word onlyA
        System.out.println(input.nextLine());//inputs the entire line
    }
}
