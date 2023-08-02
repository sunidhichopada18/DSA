package com.sunidhi;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        str("Sunidhi", "Amu", "Avni","Sara");
        fun(2, 3, 4, 5, 56, 87, 23, 45, 65);
    }
    static void str(String ...v){
        // ...var represents you can add as many strings we want or as many numbers v+we want
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v) { // array of integers
        System.out.println(Arrays.toString(v));
    }
}
