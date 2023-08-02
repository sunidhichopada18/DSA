package com.sunidhi;

import java.util.Scanner;

public class Question_Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a vaild number: ");
        int num = input.nextInt();
        int numcopy = num;
        int totaldigits = Integer.toString(num).length();
        int result = 0;

        while (num>0){

            int rem = num % 10;
            result = result + (int)Math.pow(rem, totaldigits);

            num = num/10;
        }
        System.out.println(result);
        if (numcopy == result){
            System.out.println("It is an Armstrong number");
        }else {
            System.out.println("It is not an armstrong number");
        }
    }
}
