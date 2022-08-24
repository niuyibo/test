package com.testes.learn.link;

public class TestLinkCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node first = new Node(arr[0]);
        Node other = first;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            other.next = temp;
            other = temp;
        }


        while (null != first) {
            System.out.println(first.val);
            first = first.next;
        }
    }
}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}