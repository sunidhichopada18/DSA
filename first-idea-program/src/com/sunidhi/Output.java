//folder in which java file lies. for exmaple files in rahul package should be accessed by kunal package

// com means Sunidhi is a subfolder in the folder
package com.sunidhi;


public class Output {
    //psvm shortcut
    public static void main(String[] args) {
       //sout shortcut
        System.out.println("Hello World");
    /*
        System is just a class, system has a variable called
        out which is of type printstream and out has a
        method called println.

        standard output stream is command line, standard output
        stream main print something

     */
        System.out.println("My name is Sunidhi");

    //if you don't want a new line then for the first one just write print
        System.out.print("Hello World");
        System.out.println("My name is Sunidhi");
    }
}
