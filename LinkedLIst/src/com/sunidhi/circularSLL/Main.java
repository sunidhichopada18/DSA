package com.sunidhi.circularSLL;

public class Main {
    public static void main(String[] args) {
        CircularSLL csll = new CircularSLL();
//        csll.createCSLL(45);
        //System.out.println(csll.head.value);
        //System.out.println(csll.head.next.value);
        csll.insertAtHead(1);
        csll.insertAtHead(43);
        csll.insertAtHead(3);
        csll.insertAtHead(4);
        csll.insertAtHead(23);
        csll.insertAtHead(56);
        csll.inserAtTail(44);
        csll.inserAtTail(84);
        csll.inserAtTail(94);
        csll.inserAtTail(14);
        csll.insert(7,5);
        csll.traverse();

        csll.searchNode(94);
        System.out.println(csll.deleteHead().value);
        csll.traverse();
        System.out.println(csll.deleteTail().value);
        csll.traverse();
        System.out.println(csll.delete(3).value);
        csll.traverse();
        //System.out.println(csll.tail.next.value);
    }
}
