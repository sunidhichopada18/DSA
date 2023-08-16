package com.sunidhi;

public class Factorial {
    public static void main(String[] args) {
        var result = factorial(5);
        System.out.println(result);
    }

    public static int factorial(int n){
        if(n<1){
            return -1;
        }
        if(n==0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
