package com.sunidhi;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Sunidhi";

        {
            //int a = 78; // already initialized outside the block in the same method, so you cannot initialize it again
            a = 100; //reassign the original reference variable to some other value.
            System.out.println(a); // Output: 100
            int c = 99;
            name = "Kunal";
            //values intialized in this block will remain in the block cannot be used outside the block
        }
        System.out.println(a); // Output: 100
        System.out.println(name); // Output: "Kunal"

        random(55);

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            int num = 90;
            a = 10;
        }
        System.out.println(a); // Output: 10
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num); // Output: 67
        System.out.println(marks); // Output: 55
        // this change will only be valid in this function scope.
    }
    /*
     anything initialized outside the box can be used and update inside the box
     anything initialized inside the box can be reinitialized
     outside but the one initialized inside the box can not be used
     */
}
