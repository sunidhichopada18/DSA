package com.sunidhi.singly;

import javax.print.DocFlavor;

public class SinglyLList {
    public Node head;
    public Node tail;
    public int size;

    void printLL(){
        Node pointer = head;
        for(int i = 0; i < size; i++){
            System.out.print(pointer.value + " -> ");
            pointer = pointer.next;
            if(pointer == null){
                break;
            }
        }
        System.out.println("END");
    }

    Node getNode(int index){
        Node pointer = head;
        for(int i = 0; i < index; i++){
            pointer = pointer.next;
        }
        return pointer;
    }

    void insertHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    void insertTail(int val){
        if(tail == null){
           insertHead(val);
           return;
        }
        Node newNode = new Node(val);
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    void insert(int val, int index){
        if(index == 0){
            insertHead(val);
            return;
        }
        if(index == size - 1){
            insertTail(val);
            return;
        }
        Node pointer = head;
        for(int i = 0; i < index - 1; i++){
            pointer = pointer.next;
        }
        Node newNode = new Node(val);
        newNode.next = pointer.next;
        pointer.next = newNode;
        size++;
    }

    Node deleteHead(){
        Node deltedNode = head;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return deltedNode;
    }

    Node deleteTail(){
        Node deleteTail = tail;
        Node newNode = getNode(size - 2);
        tail = newNode;
        tail.next = null;
        size--;
        return deleteTail;
    }

    Node delete(int index){
        if(index == 0){
            return deleteHead();
        }
        if(index == size -1){
            return deleteTail();
        }
        Node prevNode = getNode(index - 1);
        Node currNode = getNode(index);
        prevNode.next = currNode.next;
        size--;
        return currNode;
    }
}
class Node{
    int value;
    Node next;

    public Node(int val){
        this.value = val;
    }
    public Node(int val, Node next){
        this.value = val;
        this.next = next;
    }
}