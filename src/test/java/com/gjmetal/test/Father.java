package com.gjmetal.test;

/**
 * @author: cwq
 * @date: 2020/4/13 20:14
 * @description: //TODO
 **/
abstract class Father {
    private void console() {
        System.out.println("x:game over");
    }
}

class Exam extends Father {
//    int void =0; 关键词不能做变量

    public static void main(String[] args) {
//        int novoid = void +1; 静态成员不能调非静态成员
        Happy h = new Happy();
        new Thread(h).start();
        new Thread(h).start();
//        Father father = new Father();抽象方法不能实列化

//        public void console(){ 子类public优先级高于父类方法private修饰
//            super.console();父类方法有private修饰
//        }

    }
}

class Happy implements Runnable {
    private int x;

    public void run() {
        for (int x = 0; x != 10; x++) {
            System.out.println("x=" + x);
        }
    }
}