package com.aspart.art.threadss;


public class ThreadTest {

        public static void main(String[] args) {
                final Hero gareen = new Hero("gareen", 616, 25);
                System.out.format("gareen 的初始血量是：%.2f%n", gareen.hp);

                int iterNo = 10000;
                Thread[] recrThreads = new Thread[iterNo];
                Thread[] hurtThreads = new Thread[iterNo];

                for (int i = 0; i < iterNo; i++) {
                        Thread th = new Thread() {
                                public void run() {
                                        try {
                                                gareen.recover();
                                                Thread.sleep(100);
                                        } catch (InterruptedException e1) {
                                                // TODO Auto-generated catch block
                                                e1.printStackTrace();
                                        }
                                }
                        };
                        th.start();
                        recrThreads[i] = th;
                }

                for (int i = 0; i < iterNo; i++) {
                        Thread th = new Thread() {
                                public void run() {
                                        try {
                                                gareen.hurt();
                                        } catch (InterruptedException e1) {
                                                // TODO Auto-generated catch block
                                                e1.printStackTrace();
                                        }
                                        try {
                                                Thread.sleep(100);
                                        } catch (InterruptedException e) {
                                                e.printStackTrace();
                                        }
                                }
                        };
                        th.start();
                        hurtThreads[i] = th;
                }

                for (Thread t : recrThreads) {
                        try {
                                t.join();
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                }

                for (Thread t : hurtThreads) {
                        try {
                                t.join();
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                }

                System.out.format("gareen 最终的血量为：%.2f%n", gareen.hp);
        }
}
