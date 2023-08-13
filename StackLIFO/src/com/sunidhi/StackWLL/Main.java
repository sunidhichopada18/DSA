package com.sunidhi.StackWLL;

public class Main {
    public static void main(String[] args) {
        StackLL stackll = new StackLL();
        stackll.push(2);
        stackll.push(3);
        stackll.push(4);
        stackll.push(5);
        stackll.push(6);
        stackll.printSLL();
        System.out.println(stackll.pop());
        stackll.printSLL();
        //System.out.println(stackll.getTopOfStack());
        stackll.deleteStack();
        stackll.printSLL();
    }


}
