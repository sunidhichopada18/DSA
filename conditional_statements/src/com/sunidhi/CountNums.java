package com.sunidhi;

public class CountNums {
    public static void main(String[] args) {
        int n = 4545455;

        int count = 0;
        while (n>0){

            int rem = n % 10;
            if (rem == 5){
                count++;
            }
            n = n/10;
        }

        System.out.println(count);
    }
}
