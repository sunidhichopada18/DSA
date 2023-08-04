
// take integer input till user enters zero and print the largest number from all

package com.sunidhi;

import java.util.Scanner;

public class Question_LargestNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lar = 0;


        while (true){

            int a = input.nextInt();

            if (a > lar){
                lar = a;
            } else if (a == 0)
                break;
        }
        System.out.println("The largest number is " + lar);

    }
}
