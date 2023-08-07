// Area and Circumference of a circle with user input! //

package com.sunidhi;

import java.util.Scanner;

public class Question_AreaCircumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double r = input.nextDouble();
        double area = area(r);
        double circum = circumference(r);

        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circum);
    }
    static double area(double r){
        double ans = ((double) 22 /7) * r * r ;
        return ans;
    }
    static double circumference(double r){
        double ans = ((double) 22 /7) * 2 * r;
        return ans;
    }
}