package com.sunidhi;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Sunidhi";
        greet(name);
    }
    static void greet(String naam){
        System.out.println(naam);
        // java only has pass by value and not pass by reference
    }
}
