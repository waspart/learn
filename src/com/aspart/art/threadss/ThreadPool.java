package com.aspart.art.threadss;


import java.util.LinkedList;


public class ThreadPool {

        int threadPoolSize = 10;
        LinkedList<Runnable> tasks = new LinkedList<>();

        public ThreadPool() {
                synchronized (tasks) {
                        for (int i = 0; i < threadPoolSize; i++) {
                                new TaskConsumeThread("任务消费者线程  " + i).start();
                        }
                }
        }

        public void add(Runnable r) {
                synchronized (tasks) {
                        tasks.add(r);
                        tasks.notifyAll();
                }
        }

        class TaskConsumeThread extends Thread {
                public TaskConsumeThread(String name) {
                        super(name);
                }

                Runnable task;

                public void run() {
                        System.out.println("启动：" + this.getName());
                        while (true) {
                                synchronized (tasks) {
                                        while (tasks.isEmpty()) {
                                                try {
                                                        tasks.wait();
                                                } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                }
                                        }
                                        task = tasks.removeLast();
                                        task.notifyAll();
                                }
                                System.out.println(this.getName() + "\t获取到任务，并执行");
                                task.run();
                        }
                }

        }

}
