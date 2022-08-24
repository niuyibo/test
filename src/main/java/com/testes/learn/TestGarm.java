package com.testes.learn;

public class TestGarm {
    private volatile static int state = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            while (0 == state) {
                try {
                    Thread.sleep(500);
                    System.out.println("播放视频");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("计算结束，重回游戏");
            Thread.interrupted();
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    if(8 > i) {
                        Thread.sleep(1000);
                        System.out.println("正在计算");
                        continue;
                    }
                    state = 1;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
