package com.sunidhi;

import java.util.Scanner;

public class Question_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int result = sum(a, b);
        System.out.println(result);

    }
    static int sum(int a, int b){
        int ans = a + b;
        return ans;
    }




}
