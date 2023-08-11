package com.amuteaching;

public class MainAnimals {
    public static void main(String[] args) {
        Animals tiger = new Animals(2,2,2);
        Animals lion = new Animals(4,7,9);
        Animals elephant = new Animals(7,1,3);
        System.out.println(tiger.eyes);
        lion.changeNo(8);
        System.out.println(lion.eyes);
    }
}
