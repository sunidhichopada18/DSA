package com.sunidhi;

public class Overloading {
    public static void main(String[] args) {
        int ans = fun(10, 20);
        System.out.println(ans);
        fun(67);
        fun("Suidhi Chopada");
    }
    static int fun(int a, int b){
        return a + b;
    }
    static void fun(int a){
        System.out.println("First one: ");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second one: ");
        System.out.println(name);
    }
}
