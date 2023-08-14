package com.sunidhi.LinearSearch;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {-5, 2, 5, 7, 9, 12, 15, -20, 22, 21, 6, 23, 90};
        System.out.println(minValue(arr));
    }
    static int minValue(int[] arr){
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
