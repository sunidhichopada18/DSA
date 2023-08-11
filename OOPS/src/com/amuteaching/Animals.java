package com.amuteaching;

public class Animals {
    int eyes;
    int hands;
    int legs;

    public Animals(int E, int H, int L){
        this.eyes = E;
        this.hands = H;
        this.legs = L;
    }

    public void changeNo(int newNoOfEyes){
        this.eyes = newNoOfEyes;
    }
}
