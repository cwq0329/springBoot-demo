package com.gjmetal.pojo;

import lombok.Synchronized;

import java.util.ArrayList;
import java.util.List;

public class MyStringBuffer {
    private List list;
    //private  int offeset=0;

    public MyStringBuffer() {
        ArrayList<Object> list1 = new ArrayList<>();
        this.list = list1;
    }

    public MyStringBuffer(int n) {
        ArrayList<Object> list1 = new ArrayList<>(n);
        this.list = list1;
    }


    public  synchronized MyStringBuffer append(String s) {
        char[] chars = s.toCharArray();
        //int i=0;
        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
        }
        //offeset+=i;
        return this;
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < list.size(); i++) {
            char c = (char) list.get(i);
            s += c;
        }
        return s;
    }
}
