package com.sunidhi.singlyLL;

import com.sunidhi.circularSLL.CircularSLL;

public class Main {
    public static void main(String[] args) {
        //LinkedList<Object> newName = new LinkedList<>();
//        LinkedList<String> str = new LinkedList<>();
//        str.add("A");
//        str.add("B");
//        str.add("C");
//        System.out.println(str);
        CustomLL linkedList = new CustomLL();
        linkedList.insertHead(5);
        linkedList.insertHead(4);
        linkedList.insertHead(78);
        linkedList.insertHead(90);
        linkedList.insertHead(23);
        linkedList.printLL();
        linkedList.insertTail(56);
        linkedList.insertTail(78);
        linkedList.insertTail(18);
        linkedList.insertTail(89);
        //linkedList.printLL();
        linkedList.insertAnyPosition(1,2);

        linkedList.printLL();
        //System.out.println(linkedList.findNodeIndexByValue(78));
        linkedList.rotate(3);
        linkedList.printLL();
        linkedList.setValue(8,3);
        linkedList.printLL();


        //System.out.println(CSLL.head.value);
        //System.out.println(CSLL.head.next.value);


    }
}