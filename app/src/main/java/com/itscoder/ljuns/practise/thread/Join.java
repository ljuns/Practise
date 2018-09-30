package com.itscoder.ljuns.practise.thread;

/**
 * @author ljuns
 * Created at 2018/9/30.
 * I am just a developer.
 */
public class Join {
    public static void main(String[] args) {
        Thread previous = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Domino(previous), "domino " + i);
            thread.start();
            previous = thread;
            System.out.println("thread start domino " + i);
        }
    }

    /**
     * join：在线程 A 中，线程 B 调用了 join() 方法，那么线程 A 等待线程 B 执行完成后才执行
     * 内部实现是通过 wait()、notifyAll() 来实现的：
     * 线程 B 调用 wait() 方法，当线程 B 执行完后会自动调用自己的 notifyAll() 方法，从 wait() 方法返回；
     * 然后再从 join() 方法返回
     */
    static class Domino implements Runnable {
        Thread mThread;

        Domino(Thread thread) {
            mThread = thread;
        }

        @Override
        public void run() {
            try {
                mThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread run " + mThread.getName());
        }
    }
}
