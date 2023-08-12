package com.sunidhi.singlyLL;

public class CustomLL {

    private Node head;
    private Node tail;
    public int size;

    public CustomLL(){
        this.size = 0;
    }
    // class methods -->
    // method to print the linked list
    void printLL(){
        Node pointer = head;
        while(pointer!=null){
            System.out.print(pointer.value + " -> ");
            pointer = pointer.next;
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
    int getNodeValue(int index){
        Node pointer = head;
        for(int i = 0; i < index; i++){
            pointer = pointer.next;
        }
        return pointer.value;
    }

    int findNodeIndexByValue(int val){
        Node pointer = head;
        for(int i = 0; i < size; i++){
            if(pointer.value == val){
                return i;
            }
            pointer = pointer.next;
        }
        return -1;

    }
    // rotate a linked list by index
    public void rotate(int index){
        if(index < 0 && index > size){
            return;
        }
        Node pointer = head;
        tail.next = head;
        for(int i = 0; i < index; i++){
            pointer = pointer.next;
        }
        head = pointer;
        Node newTail = pointer;
        for(int i = 0; i < size - 1; i++){
            newTail = newTail.next;
        }
        newTail.next = null;
    }
    // update a value at given index;
    void setValue(int newVal, int index){
        Node pointer = getNode(index);
        pointer.value = newVal;
    }
    // method to insert at head
    void insertHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(tail==null){
            tail = head;
        }
        size ++;
    }

    // insert a newnode  at position of the linked list
    void insertTail(int val){
        if(head==null){
            insertHead(val);
        }else{
            Node newNode = new Node(val);
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
            size++;
        }
    }

    void insertAnyPosition(int val, int index){
        if(head == null){
            insertHead(val);
        } else if (index == size) {
            insertTail(val);
        }else{
            Node prevNode = getNode(index-1);
            Node newNode = new Node(val);
            newNode.next = prevNode.next;
            prevNode.next = newNode;

            size++;
        }
    }

    Node deleteHead(){
        if(head == null){
            tail = null;
            return null;
        }
       Node tempPointer = head;
       head = head.next;
       size--;
       return tempPointer;
    }

    Node deleteTail(){
        if(tail == null){
            head = null;
            return null;
        }
        Node prevToTail = getNode(size-2);
        Node tailPointer = tail;
        prevToTail.next = null;
        tail = prevToTail;
        size--;
        return tailPointer;
    }

    Node delete(int index){
        if(index==0){
            return deleteHead();
        }else if (index == size-1){
            return deleteTail();
        }
        Node curNode = getNode(index);
        Node prevNode = getNode(index-1);
        prevNode.next = prevNode.next.next;
        size--;
        return curNode;
    }



    class Node{
        int value;
        Node next;

        public Node(int val){
            this.value = val;
        }
        public Node(int val, Node nextNode){
            this.value = val;
            this.next = nextNode;
        }
    }

}
