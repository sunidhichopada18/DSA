package com.amuteaching;

public class Main {
    public static void main(String[] args) {
        Food burger = new Food("junk", "Mcd", 300, 2);
        System.out.println(burger.calories);
        System.out.println(burger.type);
        System.out.println(burger.style);
        System.out.println(burger.spicyRating);

        System.out.println("");

        Food vegThali = new Food("Homemade", "Homemade", 50, 1);
        System.out.println(vegThali.calories);
        System.out.println(vegThali.type);
        System.out.println(vegThali.style);
        System.out.println(vegThali.spicyRating);

        System.out.println("");

        burger.changeCalories(450);
        System.out.println(burger.calories);
        vegThali.changeCalories(360);
        System.out.println(vegThali.calories);

        System.out.println("");

        Food pizza1 = new Food();
        Food pizza2 = new Food();
        Food pizza3 = new Food();
        Food pizza4 = new Food();
        System.out.println(pizza1.calories);
        System.out.println(pizza2.style);
        System.out.println(pizza3.type);
        System.out.println(pizza4.spicyRating);

    }
}
class Food {
    String type;
    int calories;
    String style;
    int spicyRating;

    Food(){
        this.calories = 346;
        this.type = "Junk";
        this.style = "Dominos";
        this.spicyRating = 2;
    }
    Food(String type, String style, int calories, int spicyRating){
        this.style = style;
        this.calories = calories;
        this.spicyRating = spicyRating;
        this.type = type;
    }

    void changeCalories(int newCalories){
        this.calories = newCalories;
    }
}
