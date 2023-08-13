package com.sunidhi.CircularQueue;

public class CircularQueue {
    int[] arr;
    int front;
    int rear;
    int size;

    public CircularQueue(int size){
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmpty(){
        if(front == -1){
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull(){
        if(rear +1 == front){
            return true;
        }else if(front == 0 && rear == arr.length - 1){
            return true;
        }else{
            return false;
        }
    }

    public void enQueue(int val){
        if(isFull()){
            System.out.println("The CQ is full");
        }else if(isEmpty()){
            front = 0;
            rear++;
            arr[rear] = val;
        }
        else{
            if(rear == arr.length-1){
                rear = 0;
            }else{
                rear++;
            }
            arr[rear] = val;
        }
    }

}
