// take integer inputs till the user enters zero and print the average of it

package com.sunidhi;

import java.util.Scanner;
public class Question_Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        float avg = 0;

        while (true){
            int num = input.nextInt();
            sum += num;
            count++;


            if (num == 0) {
                break;
            }

        }


        avg = (float)(sum)/(float) ((count - 1));
        System.out.println("The average is: " + avg);

    }

}
