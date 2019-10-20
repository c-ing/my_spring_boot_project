package com.cdc.thread.demo.t1;

/**
 * 创建线程的几种方式
 */

public class NewThread implements Runnable {

    @Override
    public synchronized void run() {
        while (true) {
            System.out.println("自定义的线程运行了");
            try {
                //时间到了自动到就绪状态
                //Thread.sleep(100);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        NewThread n = new NewThread();

        //初始状态
        Thread thread = new Thread(n); // 创建线程，并指定线程任务
        // 就绪状态
        thread.start();  // 启动线程

        // 线程可以并行执行，如何知道启动了另一个线程呢
        // 一个线程里while（true)如果没有退出条件，则会一直运行
        while (true) {
            synchronized (n) {
                System.out.println("主线程执行了。。。。。。。");
                //Thread.sleep(100);
                n.notify();
            }

        }
    }
}
