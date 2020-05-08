package com.gjmetal;

/**
 * @author: cwq
 * @date: 2020/4/30 21:13
 * @description: //TODO
 **/
public class Mytask {


    private static volatile int state = 0;

    static class Thread1 extends Thread {
        @Override
        public void run() {


            while (true) {
                if (state % 3 == 0) {
                    System.out.println("1");
                    state++;
                }

            }
        }
    }


    static class Thread2 extends Thread {
        @Override
        public void run() {


            while (true) {
                if (state % 3 == 1) {
                    System.out.println("2");
                    state++;
                }
            }
        }
    }

    static class Thread3 extends Thread {
        @Override
        public void run() {


            while (true) {
                if (state % 3 == 2) {
                    System.out.println("3");
                    state++;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Mytask.Thread2().start();
        new Mytask.Thread3().start();
        new Mytask.Thread1().start();


    }
}
