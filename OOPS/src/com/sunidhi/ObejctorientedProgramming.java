package com.sunidhi;

// blue print --> classes
class Pen{
    String color; // properties ko access . lagake karte hain
    String type; //ballpoint; gel; ink pen

    public void write(){
        System.out.println("writing something"); //function to write something.
    }

    public void printColor(){
        System.out.println(this.color); //this says which pen is calling this function.
        // uss jagah ko konsi object access karne ka try kar rhi hain.
    }
}
//class ke naam capital letters se start honge and functions ke naam small letters se.
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // non parametric constructor.
    Student(){ // if this is not mentioned java ek khud constructor bana leta hain
        System.out.println("constructor called");
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    // copy of constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age; //student 2 ki saari information ko copy karke apne current object main daal rha hain.
    }
}

// objects ---> main function maruti car market ke liye bana na hain
public class ObejctorientedProgramming{
    public static void main(String[] args) {
        Pen pen1 = new Pen(); //object ko bana liya
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();

        pen1.write(); // calling a function.

        Student s1 = new Student();
        /*
        new keyword laga ne se heap main ek jagah allocate ho jaayegi uss jagah object jaake store ho jaayegi.
        Student() --> constructor, kuch construct karna, java ki objects ko construct karna.
        constructor ka name same hoga jo class ka name hain.
        contructors do not return anything.
        1 object ke liye constructor ek hi baar call ho sakta hain.

        types of constructors
        1. non-parametric
        2. parametric
        3. copy of constructor

        */
        s1.name = "Sunidhi";
        s1.age = 24;

        Student s2 = new Student(s1);

        s1.printInfo();
    }
}


