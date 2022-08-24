package com.testes.learn;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class TestLinkedBlockQueue {

    private static BlockingQueue<Integer> queue = new LinkedBlockingQueue();
    private static BlockingQueue deque = new LinkedBlockingDeque();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int j = i;
            new Thread(() -> {
                queue.offer(j);
            }).start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        System.out.println("1");
    }
}
