package com.sunidhi;

import java.util.Scanner;
//conditions: a. the two types should be compatible
// b. destination type should be greater than the source type
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //float num = input.nextFloat();
        //int num = input.nextFloat(); //will give error because int<float so it cant be in LHS
        //int num = input.nextInt(); //will give error if we enter a float number
        //type casting//
        //int num = (int)(67.56f); //converting float to integer ---> typecasting (Compressing bigger type into smaller type)
        //System.out.println(num);
        //automatics type promotion in expression//
        //int a = 257;
        //byte b = (byte) (a); //maximum value that can be put up is 256 and here since its 257 we perform modular division 257 % 256 = 1
      // byte a = 40;
       //byte b = 50;
       //byte c = 100;
       //int d = a * b / c;
       //here how byte is able to store 40*50=2000 in spite its capacity of 256 so here it automatically converts it into integer ---> Automatic type promotion
        //System.out.println(d);
        //byte b = 50;
        //b = (byte) (b * 2);// since b * 2 is an integer now, how can we assign this to byte
        //System.out.println(b);
        int number = 'A';
        System.out.println(number); //prints the ascii value
// JAVA is a unicode language
     // 1. All the byte, short and characters are promoted to integers

    }
}
