package com.sunidhi;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 3]
        System.out.println(arr[3]);

        // input using for loops
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");

        //          --- Method 2 ---

        for (int num : arr) { // for every element in array print the element.
            System.out.print(num + " "); // here num represents element of the array
        }

        //  System.out.println(arr[5]); --> index out of bound error
    }
}