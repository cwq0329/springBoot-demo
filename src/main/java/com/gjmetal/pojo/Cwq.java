package com.gjmetal.pojo;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Cwq {
    public static void main(String[] args) {
        System.out.println("陈".codePointAt(0));
        //language=JSON
        String json = "{}";
        // Tpyer Reference insomnia.rest
        try {
            System.out.println("陈".getBytes("utf-8"));
            System.out.println(Arrays.toString("陈".getBytes("utf-8")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("\u9648");
        // ‭1001 0110 01
        //‭ 11101001 10011001  10001000‬

    }
}
