package com.sunidhi;

import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        /*
        int rollno = 64;

        //string is not primitive
        //primitive is any datatype that you can not break it into further datatype, eg sunidhi can be broken into s, u , n ....so string is not a primitive datatype
        char letter = 'r';
        float marks = 98.67f;//by default all the decimal values are double so if we want float we have to write it as f
        double largeDecimalNumbers = 445645.3647;
        long LargeInteger = 5756565635646758L; //provides to store longer value
        boolean check = false;


        //Integer rno = 64; // here integer is the class

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your roll no.: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);
    */


    // int a = 18 ---> a is identifier and 18 is literal
    // int a = 234,000,000(2hundred34milllion), here comma doesn't work use 234_000_000
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
