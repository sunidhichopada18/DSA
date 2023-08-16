package com.sunidhi;

public class fibonacci {
    public static void main(String[] args) {
        int result = Fibonacci(6);
        System.out.println(result);
    }
    static int Fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        if(n < 1){
            return -1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
