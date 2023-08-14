package com.sunidhi.BinarySearch;

import java.util.Scanner;

public class ReverseBinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int[] arr = {100, 90, 78, 56, 23, 10, 9, 7, 6};
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                end = mid - 1;
            }else if(target < arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
}

