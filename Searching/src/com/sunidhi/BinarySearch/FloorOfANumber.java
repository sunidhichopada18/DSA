package com.sunidhi.BinarySearch;

import java.util.Scanner;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {6, 7, 9, 10, 23, 56, 78, 90, 100};
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        System.out.println("The floor value of " + target + " is " + floorValue(arr, target));
    }

    static int floorValue(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        if(target == arr[start]){
            return arr[end];
        }
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target <= arr[mid]){
                end = mid - 1;
            }
        }
        return arr[end];
    }

}
