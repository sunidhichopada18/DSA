package com.sunidhi;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(8,12));
    }
    static int gcd(int a , int b){
        if(a < 0 || b < 0){
            return -1;
        }
        if(b!=0){
            return gcd(b,a%b);
        }
        return a;
    }
}
