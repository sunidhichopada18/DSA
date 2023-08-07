package com.sunidhi;

import java.util.Scanner;

public class Question_Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = input.nextInt();
        String result = grades(marks);
        System.out.println("for marks " + marks + " grade equals " + result );
    }
    static String grades(int marks){
        if (marks > 100){
            return "invalid";
        }else if (marks >= 91){
            return "AA";
        }else if (marks >= 81 ){
            return "AB";
        }else if (marks >= 71){
            return "BB";
        }else if (marks >= 61){
            return "BC";
        }else if (marks >= 51){
            return "CD";
        }else if (marks >= 41){
            return "DD";
        }
        return "fail";
    }
}
