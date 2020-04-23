package com.assess15.algorithm.linkedList.Reverse_Double_Linked_List;

public class DoubleLinkedListReverse {

    public static void main(String[] args) {
        DoubleNode head = new DoubleNode(1);
        DoubleNode mid1 = new DoubleNode(2);
        DoubleNode mid2 = new DoubleNode(3);
        DoubleNode mid3 = new DoubleNode(4);
        DoubleNode tail = new DoubleNode(5);

        head.next = mid1;
        mid1.next = mid2;
        mid2.next = mid3;
        mid3.next = tail;

        System.out.println("反转前");
        print(head);
        head = reverse(head);
        System.out.println(" ");
        System.out.println("反转后");
        print(head);
    }

    public static DoubleNode reverse(DoubleNode head) {
        DoubleNode prev = null;
        DoubleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            head.prev = next;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void print(DoubleNode head) {
        while (head != null) {
            System.out.print(head.value);
            System.out.print(" ");
            head = head.next;
        }
    }
}
