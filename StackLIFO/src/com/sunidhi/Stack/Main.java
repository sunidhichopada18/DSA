package com.sunidhi.Stack;

public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(5);
        //boolean result = newStack.isFull();
        //System.out.println(result);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.printStack();
        newStack.push(5);
        newStack.printStack();
        //newStack.pop();
        System.out.println(newStack.pop());
        //System.out.println(newStack.peek());

        newStack.printStack();
        System.out.println(newStack.pop());
        newStack.printStack();
        System.out.println(newStack.pop());
        newStack.printStack();
        //newStack.deleteStack();
        //System.out.println(newStack.peek());
    }
}