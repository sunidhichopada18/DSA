package com.sunidhi.QueueLL;

public class Main {
    public static void main(String[] args) {
        QueueLL qLL = new QueueLL();
        qLL.enQueue(1);
        qLL.enQueue(2);
        qLL.enQueue(3);
        qLL.enQueue(4);
        qLL.printQLL();
       // System.out.println(qLL.deleteHead());
        //qLL.printQLL();
        System.out.println(qLL.getTop());
        System.out.println(qLL.deQueue());
        System.out.println(qLL.getTop());
        qLL.printQLL();
    }


}
