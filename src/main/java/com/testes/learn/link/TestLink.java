//package com.testes.learn.link;
//
//public class TestLink {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(arrayToListNode(arr).val);
//
//
//        Node root = arrayToListNode(arr);
//        while(null != root) {
//            System.out.println(root.val);
//            root = root.next;
//        }
//    }
//
//    //数组转换成链表
//    public static Node arrayToListNode(int[] arr) {
//        Node root = new Node(arr[0]);//生成链表的根节点，并将数组的第一个元素的值赋给链表的根节点
//        Node other = root;//生成另一个节点，并让other指向root节点，other在此作为一个临时变量，相当于指针
//        for (int i = 1; i < arr.length; i++) {//由于已给root赋值，所以i从1开始
//            Node temp = new Node(arr[i]);//每循环一次生成一个新的节点,并给当前节点赋值
//            other.next = temp;//将other的下一个节点指向生成的新的节点
//            other = temp;//将other指向最后一个节点(other的下一个节点)  other=other.getNext();
//        }
//        return root;
//    }
//}
//
//
//class Node {
//    Integer val;
//    Node next;
//
//    public Node(Integer val) {
//        this.val = val;
//    }
//}