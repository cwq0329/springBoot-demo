package com.gjmetal.test;

/**
 * @author: cwq
 * @date: 2020/4/17 21:45
 * @description: //TODO
 **/
public abstract class UNIT {
    public UNIT() {
    }

    public static final UNIT HOURS = new UNIT() {
        @Override
        void say() {

        }
    };


    public static final UNIT MIN = new UNIT() {
        @Override
        void say() {

        }
    };


    abstract void say();

}
