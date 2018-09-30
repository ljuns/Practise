package com.itscoder.ljuns.practise.thread;

/**
 * @author ljuns
 * Created at 2018/9/30.
 * I am just a developer.
 */
public class WaitNotify {

    private static boolean mFlag;
    private static Object lock = new Object();

    /**
     * 调用 wait()、notify()、notifyAll() 方法前必须先获取到对象的锁（synchronized (lock)）；
     * 调用 wait() 方法后会释放锁，等待其他线程的唤醒或者等待被中断；
     * 调用 notify()、notifyAll() 方法后 wait() 方法并不会立即返回，需要等当前线程释放锁（执行完成）
     */
    static class Wait implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                while (!mFlag) {
                    try {
                        System.out.println("wait");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("wait back");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Notify implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify");
                lock.notify();
                mFlag = true;
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (lock) {
                System.out.println("notify again");
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Wait(), "wait");
        Thread thread2 = new Thread(new Notify(), "notify");

        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}

