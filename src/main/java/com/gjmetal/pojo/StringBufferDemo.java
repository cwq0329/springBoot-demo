package com.gjmetal.pojo;

import java.util.HashMap;

public class StringBufferDemo {
    public static void main(String[] args) {
        MyStringBuffer ms = new MyStringBuffer();
        StringBuffer stringBuffer = new StringBuffer();
        new HashMap<>();

        MyStringBuffer r = ms.append("sdsafafsafs").append("11111");
        System.out.println(r.toString());
    }
}
