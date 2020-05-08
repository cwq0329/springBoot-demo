package com.gjmetal.test;

/**
 * @author: cwq
 * @date: 2020/4/26 21:20
 * @description: //TODO
 **/
public class HongLi {
    public static void main(String[] args) {
        Double x = (double) 1 / 2 + (double) 3;
        System.out.println("x = [" + x + "]");
        System.out.println("--begin");
        new HongLiB();
        System.out.println("---end");
        Integer youNumber = 123456789;
        String format = String.format("%03d", youNumber);
        System.out.println(format);
    }
}

class HongLiB extends HongLiA {
    public HongLiB() {
        System.out.println("HongLiB");
    }

    static {
        System.out.println("B static");
    }

    {
        System.out.println("B class");
    }
}

class HongLiA {
    public HongLiA() {
        System.out.println("HongLiA");
    }

    {
        System.out.println("A class");
    }

    static {
        System.out.println("A static");
    }
}