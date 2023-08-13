package com.sunidhi.StackWLL;

import javax.crypto.spec.PSource;

public class StackLL {
    public Node head;
    public Node tail;
    public int size;

    public void printSLL(){
        Node pointer = head;
        while(pointer != null){
            System.out.print(pointer.value);
            pointer = pointer.next;
            if(pointer != null){
                System.out.print(" -> ");
            }
        }
        System.out.println(" ");
    }
    public boolean isEmpty(){
        boolean flag = true;
        if(head != null){
            flag = false;
        }
        return flag;
    }
    public int getTopOfStack(){
        if(isEmpty()){
            return -1;
        }
        return head.value;
    }
    // insert head
    public void push(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
        if(tail == null){
            tail = head;
        }
    }
    public int pop(){
        if(head == null){
            tail = null;
            return -1;
        }
        Node deletedNode = head;
        head = head.next;
        size--;
        return deletedNode.value;
    }
    public void deleteStack(){
        head = null;
        System.out.println("the stack is deleted successfully");
    }
}
class Node{
    int value;
    Node next;

    public Node(int val){
        this.value = val;
    }
}
