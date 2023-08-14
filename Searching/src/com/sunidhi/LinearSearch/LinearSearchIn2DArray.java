package com.sunidhi.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},
                {4, 5},
                {6, 7, 8},
                {10, 11, 12, 13}};

        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(Arrays.toString(LinearSearchIn2D(arr, target)));
    }
    static int[] LinearSearchIn2D(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
