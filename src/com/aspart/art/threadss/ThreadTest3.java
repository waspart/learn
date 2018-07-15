package com.aspart.art.threadss;


/**
 * test threads
 * @author aspart
 *
 */
public class ThreadTest3 {

        public static void main(String[] args) {
                final Hero gareen = new Hero("gareen", 1000, 23);

                Thread t1 = new Thread() {
                        public void run() {
                                while (true) {
                                        try {
                                                gareen.hurt();
                                                Thread.sleep(10);
                                        } catch (InterruptedException e) {
                                                e.printStackTrace();
                                        }
                                }
                        };
                };

                Thread t2 = new Thread() {
                        @Override
                        public void run() {
                                while (true) {
                                        try {
                                                gareen.recover();
                                                Thread.sleep(5);
                                        } catch (InterruptedException e1) {
                                                e1.printStackTrace();
                                        }
                                }
                        }
                };

                t1.start();
                t2.start();

        }

}
