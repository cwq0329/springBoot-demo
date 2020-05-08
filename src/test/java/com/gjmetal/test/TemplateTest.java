package com.gjmetal.test;

import java.util.ArrayList;

/**
 * @author: cwq
 * @date: 2020/5/8 17:03
 * @description: //TODO
 **/
public class TemplateTest {
    //prsf
    //psfi


    // private static final
    //sout 变形 soutp/soutm/soutv/xxx.sout
    public static void main(String[] args) {
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        int num = 10;
        int num2 = 20;
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);
        System.out.println(num);
        //fori
        String[] strings = {"a,b,c"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        //iter
        for (String string : strings) {
            System.out.println(string);
        }

        //itar
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
//            string
        }
        //list.for
        ArrayList list = new ArrayList();
        list.add(111);
        list.add(222);
        list.add(333);
        for (Object o : list) {

        }

        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //ifn
        if (list == null) {

        }

        //inn
        if (list != null) {

        }
        //xx.nn
        if (list != null) {

        }

    }
}
