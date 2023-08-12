package com.sunidhi.singly;

public class Main {
    public static void main(String[] args) {
        SinglyLList sll = new SinglyLList();
        sll.insertHead(6);
        sll.insertHead(8);
        sll.insertTail(7);
        sll.insertTail(12);
        sll.insert(3,1);
        sll.printLL();
        //sll.deleteHead();
        //sll.deleteTail();
        sll.delete(2);
        sll.printLL();
    }

}
