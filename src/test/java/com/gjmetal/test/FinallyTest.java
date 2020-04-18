package com.gjmetal.test;

/**
 * @author: cwq
 * @date: 2020/4/16 9:30
 * @description: //TODO
 **/
public class FinallyTest {

    public static void main(String[] args) {
        try {

            return;

        } catch (Exception e) {
            System.out.println("异常");
        } finally {
            System.out.println("finally执行");
        }
    }

}
