package com.sunidhi;

import java.util.Scanner;

public class AmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = isAmstrong(num);
        System.out.println(ans);

        for (int i = 0; i < 10000; i++) {
            if (isAmstrong(i)){
                System.out.print(i + " ");
            }
        }

    }
    static boolean isAmstrong(int n){
        int original = n;
        int sum = 0;
        int totaldigits = Integer.toString(n).length();

        while (n>0){
            int rem = n % 10;
            n  = n / 10;
            sum = sum + (int)Math.pow(rem, totaldigits);

        }
        //System.out.println(sum);
        if (original == sum){
            return true;
        }
        return false;


    }

}
