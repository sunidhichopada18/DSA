package com.sunidhi.QueueArr;

public class Queue{
    int[] arr;
    int front;
    int rear;


    public Queue(int size){
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    // check if queue is Empty
    public boolean isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }

    // check if queue is full
    public boolean isFull(){
        if(front == 0 && rear == arr.length -1){
            return true;
        }
        return false;
    }

    //display the queue
    public void printQ(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("FRONT -> ");
        for(int i = front; i < rear + 1 ; i++){
            System.out.print(arr[i]);
            if(i != rear){
                System.out.print(" -> ");
            }
        }
        System.out.println(" <- REAR");
        //System.out.println(" ");
    }

    // display the peek element;
    public int getTop(){
        if(isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    // insert elements in queue
    public void enQueue(int val){
        if(isFull()){
            System.out.println("Queue if full");
            return;
        }
        if(front == -1){
            front = 0;
        }
        arr[rear +1] = val;
        rear++;
    }

    // delete an element in queue;
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int deletedItem = arr[front];
        if(front == rear){
            arr[front] = 0;
            front = -1;
            rear = -1;
        }else{
            arr[front] = 0;
            front++;
        }
        return deletedItem;
    }

    // delete the whole queue;
    public void delete(){
        front = -1;
        rear = -1;
        arr = null;
    }
}
