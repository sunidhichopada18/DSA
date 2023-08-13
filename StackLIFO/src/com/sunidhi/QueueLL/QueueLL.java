package com.sunidhi.QueueLL;

public class QueueLL {
    Node head;
    Node tail;
    int size;

    public boolean isEmpty(){
        if(tail == null){
            return true;
        }
        return false;
    }

    public int getTop(){
        Node topVal = head;
        return topVal.value;
    }

    public void printQLL(){
        Node pointer = head;
        System.out.print(" FRONT -> ");
        while(pointer != null){
            System.out.print(pointer.value);
            pointer = pointer.next;
            if(pointer != null){
                System.out.print(" <- ");
            }
        }
        System.out.println(" <- REAR ");
    }

    public void enQueue(int val){
       if(isEmpty()){
           Node newNode = new Node(val);
           head = newNode;
           tail = head;
       }else {
           Node newNode = new Node(val);
           newNode.next = null;
           tail.next = newNode;
           tail = newNode;
           size++;
       }
    }
    public int deQueue(){
        if(isEmpty()){
            return -1;
        }
        Node deleteNode = head;
        head = head.next;
        size--;
        return deleteNode.value;
    }
}
class Node{
    int value;
    Node next;
    public Node(int val){
        this.value = val;
    }
}
