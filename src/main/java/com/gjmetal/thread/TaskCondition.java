package com.gjmetal.thread;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: cwq
 * @date: 2020/4/30 19:14
 * @description: //TODO
 **/
public class TaskCondition {
    private static Lock lock = new ReentrantLock();
    private static Condition a = lock.newCondition();
    private static Condition b = lock.newCondition();
    private static Condition c = lock.newCondition();
    private static int state = 0;

    static class Thread1 extends Thread {
        @Override
        public void run() {
            try {
                lock.lock();
                while (state % 3 != 0) {
                    a.await();
                }
                for (int i = 1; i < 4; i++) {
                    System.out.println(Thread.currentThread().getClass().getName() + "=" + i);
                }
                state++;
                b.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                lock.lock();
                while (state % 3 != 1) {
                    b.await();
                }
                for (int i = 1; i < 4; i++) {
                    System.out.println(Thread.currentThread().getClass().getName() + i);
                }
                state++;
                c.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }

    static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                lock.lock();
                while (state % 3 != 2) {
                    c.await();
                }
                for (int i = 1; i < 4; i++) {
                    System.out.println(Thread.currentThread().getClass().getName() + i);
                }
                state++;
                a.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }

    public static void main(String[] args) throws Exception {
        new Thread1().start();
        new Thread2().start();
        new Thread3().start();
    }

}
