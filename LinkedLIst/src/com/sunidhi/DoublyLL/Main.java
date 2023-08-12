package com.sunidhi.DoublyLL;

public class Main {
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insertHead(6);
        dll.insertHead(7);
        dll.insertTail(4);
        dll.insert(3,1);
        dll.insert(2, dll.size);

        dll.traverseDLL();
        //System.out.println(dll.delete(2).value);
        dll.reverseTraversal();
        //dll.reverseTraversal();
        System.out.println(dll.getIndexByValue(3));
        //System.out.println(dll.head.next.next.prev.value);
    }
}
