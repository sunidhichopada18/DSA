package com.sunidhi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Create_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Insertion in Array list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        //ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(30,10,60));
        System.out.println(numbers);
        // accessing elements in ArrayList
        System.out.println(numbers.get(2));
        //traversal in ArrayList
        //Method 1
        for (int i=0; i<numbers.size();i++){ //normal for loop
            Integer num = numbers.get(i);
            System.out.print(num + " ");
        }
        System.out.println("");
        //Method 2
        for (int num: numbers){ // for each loop
            System.out.print(num + " ");
        }
        System.out.println("");
        //Method 3
        Iterator<Integer> iterator = numbers.iterator(); //iterator method
        while (iterator.hasNext()){
            Integer num = iterator.next();
            System.out.print(num + " ");
        }
        System.out.println("");
        // Searching an element in ArrayList
        //Method 1
        for (Integer num:numbers){
            if(num.equals(5)){
                System.out.println("The element is found");
                break;
            }
        }
        System.out.println("");
        //Method 2
        int index = numbers.indexOf(5);
        System.out.println("The element is found at index: " + index);
        System.out.println("");
        //delete an element from an arrayList
        numbers.remove(3); //removes an element from this index
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(6)); // removes the object given
        System.out.println(numbers);



        ArrayList data = new ArrayList();
        data.add(0,4);
        data.add("Sunidhi");
        data.add(0,   6);
        System.out.println(data);
    }
}
