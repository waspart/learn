package com.aspart.art.threadss;

public class ThreadTest2 {

        final static Hero gareen = new Hero("gareen", 616, 34);
        
        static Thread t1 = new Thread() {
                public void run() {
                        while(true) {
                                
                                while(gareen.hp == 1) {
                                        continue;
                                }
                                
                                try {
                                        gareen.hurt();
                                } catch (InterruptedException e1) {
                                        // TODO Auto-generated catch block
                                        e1.printStackTrace();
                                }
                                System.out.printf("t1 为%s 减血1点，减少血后，%s的血量是%.0f%n", gareen.name, gareen.name, gareen.hp);
                                try {
                                        Thread.sleep(10);
                                } catch (InterruptedException e) {
                                        e.printStackTrace();
                                }
                        }
                }
        };
        
        static Thread t2 = new Thread() {
                public void run() {
                        while(true) {
                                gareen.recover();
                                System.out.format("t2 为%s 回血1点,增加血后，%s的血量是%.0f%n",gareen.name,gareen.name,gareen.hp);
                                try {
                                        Thread.sleep(100);
                                } catch (InterruptedException e) {
                                        e.printStackTrace();
                                }
                        }
                }
        };
        
        public static void main(String[] args) {

                t1.start();
                t2.start();
        }
        
}
