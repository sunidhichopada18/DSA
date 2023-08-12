package com.sunidhi.circularSLL;

public class CircularSLL{
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int val){
        Node newNode = new Node(val);
        newNode.next = newNode;
        head = newNode;
        tail = newNode;
        size = 1;
        return newNode;
    }

    // Insertion in CSLL

    public Node insertAtHead(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        tail.next = newNode;
        size++;

        return newNode;
    }

    public Node inserAtTail(int val){
        if(head == null){
            return insertAtHead(val);
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
        size++;
        return newNode;
    }

    public Node insert(int val, int index){
        if(index == 0){
            return insertAtHead(val);
        }
        else if(index == size){
            return inserAtTail(val);
        }
        Node newNode = new Node(val);
        Node pointer = head;
        for(int i = 0; i < index-1; i++){
            pointer = pointer.next;
        }
        newNode.next = pointer.next;
        pointer.next = newNode;
        size++;
        return newNode;
    }

    // traversal method
    public void traverse(){
        if(head != null){
            Node pointer = head;
            for(int i = 0; i < size; i++){
                System.out.print(pointer.value + " -> ");
                // if we dont want head at the end
//                if(i != size){
//                    System.out.print(" -> ");
//                }
                pointer = pointer.next;
            }
        }
        else {
            System.out.println("\nCSLL does not exist");
        }
        System.out.println("HEAD " + tail.next.value);
    }

    //Search Method

    public boolean searchNode(int val){
        if(head != null){
            Node pointer = head;
            for(int i = 0; i < size; i++){
                if(pointer.value == val){
                    System.out.println("Found node at location " + i);
                    return true;
                }
                pointer = pointer.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    public Node deleteHead(){
        Node deletedHead = head;
        if(head != null){
            tail.next = head.next;
            head = head.next;
            size --;
        }
        return deletedHead;
    }

    public Node deleteTail(){
        Node pointer = head;
        Node deletedNode = tail;
        if(tail != null){
            for(int i = 0; i < size-1; i++){
                pointer = pointer.next;
            }
            pointer.next = head;
            tail = pointer;
            size--;
        }
        return deletedNode;
    }
    public Node delete(int index){
        Node pointer = head;
        if(index==0){
            return deleteHead();
        }
        else if (index == size -1){
            return deleteTail();
        }
        Node deletedNode = null;
        if(head != null){
            for (int i = 0; i < index - 1; i++){
                pointer = pointer.next;
            }
            deletedNode = pointer.next;
            pointer.next = pointer.next.next;
            size--;
        }
        return deletedNode;
    }

    public class Node {
        public int value;
        public Node next;

        public Node(int val){
            this.value = val;
        }
        public Node(int val, Node nextNode){
            this.value = val;
            this.next = nextNode;
        }
    }
}


