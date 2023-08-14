package com.sunidhi.LinearSearch;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        char target = in.next().charAt(0);
        System.out.println(linearSearchInString(word, target));
    }
    static int linearSearchInString(String word, char target){
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
}
