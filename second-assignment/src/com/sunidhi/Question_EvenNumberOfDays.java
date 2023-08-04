package com.sunidhi;

import java.util.Scanner;

public class Question_EvenNumberOfDays {
    public static void main(String[] args) {

        int count = 0;


        for (int i = 1; i<=31; i++){
            if (i % 2 == 0){
                count++;

            }

        }

        System.out.println("Kunal can go out " + count + " number of days in the month of August");
    }

}
