package com.sunidhi.Stack;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The Stack id created with size of: " + size);
    }

    public boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(topOfStack == arr.length - 1){
            //System.out.println("The stack is full");
            return true;
        }else{
            return false;
        }
    }

    public void printStack(){
        if(isEmpty()){
            return;
        }
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] );
            if(i != arr.length - 1){
                System.out.print(" -> ");
            }
        }
        System.out.println(" <- " + "TOP");
    }
    public void push(int value){
        if (isFull()){
            return;
        }else{
            arr[topOfStack +1] = value;
            topOfStack++;
            //System.out.println("The value is successful inserted");
        }
    }

    public int pop(){
        if(isEmpty()){
            //System.out.println("The stack is empty");
            return -1;
        }
        int popVal = arr[topOfStack];
        arr[topOfStack] = 0;
        topOfStack--;
        return popVal;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int peekVal = arr[topOfStack];
        return peekVal;
    }

    public void deleteStack(){
//        if(isEmpty()){
//            return;
//        }
        while(topOfStack != -1){
            pop();
        }
        //topOfStack = -1;
    }
}
