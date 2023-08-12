package com.sunidhi.Questions;

public class LinkedList {
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

    public Node getNode(int index){
        Node pointer = head;
        for(int i = 0; i < index; i++){
            pointer = pointer.next;
        }
        return pointer;
    }

    public void delete(int index){
        if(index == 0){
            head = head.next;
        } else if (index == size - 1) {
            Node prevNode = getNode(index - 2);
            prevNode.next = null;
        }

    }

}

class Node{
    int value;
    Node next;
    Node prev;
}

