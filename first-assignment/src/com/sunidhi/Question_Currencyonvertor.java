// input currency in rupees and output in USD

package com.sunidhi;

import java.util.Scanner;

public class Question_Currencyonvertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount in rupees: ");
        float rupees = input.nextFloat();

        float usd = rupees * 75;

        System.out.println("The usd value of rupees " +  rupees + " is " +  usd);
    }
}
