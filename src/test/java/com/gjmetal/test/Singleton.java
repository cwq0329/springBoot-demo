package com.gjmetal.test;

/**
 * @author: cwq
 * @date: 2020/4/5 0:03
 * @description: //饿汉式单列
 **/
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}

/**
 * @ClassName: Singleton
 * @Description: 懒汉式单列
 * @author: cwq
 * @date: 2020/4/5 0:09
 */
class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    return new Singleton2();
                }
            }
        }
        return instance;
    }
}
