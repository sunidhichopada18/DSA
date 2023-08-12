package com.sunidhi.DoublyLL;
public class DoublyLL {
    Node head;
    Node tail;
    int size;

    //traverse DLL
    public void traverseDLL(){
        if(head != null){
            Node pointer = head;
            System.out.print("START -> ");
            for(int i = 0; i < size; i++){
                System.out.print(pointer.value);
                pointer = pointer.next;
                if(pointer == null){
                    break;
                }
                System.out.print(" <-> ");
            }
        }else{
            System.out.println("The list doesnot exists");
        }
        System.out.println(" <- END");
    }

    public void reverseTraversal(){
        Node pointer = head;
        int totalNode = 0;
        while(pointer != null){
            pointer = pointer.next;
            totalNode++;
        }
        Node pointer1 = getNode(totalNode - 1);
        System.out.print("START -> ");
        for(int i = 0; i < totalNode; i++){
            System.out.print(pointer1.value);
            pointer1 = pointer1.prev;
            if(pointer1 != null){
                System.out.print(" <-> ");
            }
        }
        System.out.println(" <- END");
    }
    int getIndexByValue(int val){
        Node pointer = head;
        //int index = 0;
        for(int i = 0; i < size; i++){
            if(pointer.value == val){
                return i;
            }
            pointer = pointer.next;
        }
        return -1;
    }
    public Node getNode(int index){
        Node pointer = head;
        for(int i = 0; i < index; i++){
            pointer = pointer.next;
        }
        return pointer;
    }
    void insertHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
        size++;
        if(tail == null){
            tail = head;
        }
    }

    void insertTail(int val){
        if(head == null){
            insertHead(val);
            return;
        }
        Node newNode = new Node(val);
        newNode.next = null;
        tail.next = newNode;

        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    void insert(int val, int index){
        if(index == 0){
            insertHead(val);
            return;
        } else if (index == size) {
            insertTail(val);
            return;
        }
        Node newNode = new Node(val);
        Node currNode = getNode(index);
        Node prevNode = getNode(index - 1);

        prevNode.next = newNode;
        newNode.next = currNode;
        newNode.prev = prevNode;
        currNode.prev = newNode;
        size++;
    }

    Node deleteHead(){
        if(head == null){
            return null;
        }
        Node deletedNode = head;
        head.next.prev = null;
        head = head.next;
        size--;
        return deletedNode;
    }
    Node deleteTail(){
        Node deletedNode = tail;
        tail.prev.next = null;
        tail = tail.next;
        size--;
        if(head == null){
            return null;
        }
        return deletedNode;
    }

    Node delete(int index){
        if(index == 0){
            return deleteHead();
        } else if (index == size - 1) {
            return deleteTail();
        }
        Node deletedNode = getNode(index);
        Node currNode = getNode(index);
        currNode.prev.next = currNode.next;
        currNode.next.prev = currNode.prev;
        size--;
        return deletedNode;
    }
}
class Node{
    public int value;
    public Node next;
    public Node prev;

    public Node(int val){
        this.value = val;
   }
}