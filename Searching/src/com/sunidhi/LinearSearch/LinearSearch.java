package com.sunidhi.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();

        System.out.println(Arrays.toString(linearSearch(arr, target, 0)));
    }
    static int[]  linearSearch(int[] arr, int target, int count){ // count represents number of iterations.
        for(int i = 0; i < arr.length; i++){
            count = count +1;
            if(arr[i] == target) {
                return new int[]{i, count};
            }
        }
        return new int[]{-1, -1};
    }
}
