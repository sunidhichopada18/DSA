// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote

package com.sunidhi;

import java.util.Scanner;

// the lines that are in comment is the alternate method.

public class Question_VotingEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        //boolean result = isEligible(age);
        String result = isEligible(age);

//        if (result == true){
//            System.out.println("Person is eligible to vote!");
//        } else {
//            System.out.println("Person is not eligible to vote!");
//        }
        System.out.println("The person's age is " + age + " so he/she " + result );
    }
//    static boolean isEligible(int age){
//        if (age >= 18){
//            return true;
//        }
//        return false;
//    }
        static String isEligible(int age){
        if (age >= 18){
            return "can vote";
        }
        return "cannot vote";
    }
}
