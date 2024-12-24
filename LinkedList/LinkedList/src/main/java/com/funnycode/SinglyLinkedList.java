package com.funnycode;

import java.util.ArrayList;

public class SinglyLinkedList {
    Node head; // 1 -> 2 -> 3

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        // Tìm node cuoi cung
        Node temp = head;
        while(temp.next != null ){
            temp = temp.next;
        }
        // temp chinh thuc la node cuoi cung hien tai
        temp.next = newNode;
        // Lay node cuoi cung hien tai noi voi newnode

    }
    // In ra link list
    public void printlist(int data){
        Node current = head;
        while(current != null) System.out.print(current.data);

    }
    // getNodeByIndex() => In ra 1 giá trị của Node đó tại ví trí index
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addLast(1);
        singlyLinkedList.addLast(2);

    }

}
