package com.sunidhi;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);
        System.out.println("a = " + a +"  b = " + " " + b);

        String name = "Sunidhi Chopada"; // no name changed in the output
        changename(name);
        System.out.println(name);
    }
    static void changename(String name){
        name = "Rahul Rana";
    }


// primitives like int, short, char, byte -- just passing value
// objects and stuff -- passing value of the reference

    static void swap(int a, int b){ // no numbers swapped in the output
        int temp = a;
        a = b;
        b = temp;
    }




}
