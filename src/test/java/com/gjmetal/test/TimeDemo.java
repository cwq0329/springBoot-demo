package com.gjmetal.test;

import lombok.Data;

import java.util.HashMap;

/**
 * @author: cwq
 * @date: 2020/4/29 21:30
 * @description: //TODO
 **/
@Data
public class TimeDemo {
    //    Date time;
    private HashMap<Object, RealVlaue> map;

    public TimeDemo() {
        this.map = new HashMap<Object, RealVlaue>();

    }

    public Object put(Object key, Object value, Long expre) {
        if (expre < 0) {
            throw new IllegalArgumentException("expre is not ");
        }
        RealVlaue realVlaue = new RealVlaue(value, System.currentTimeMillis(), expre);
        return map.put(key, realVlaue);
    }

    public Object get(Object key) {
        RealVlaue realVlaue = map.get(key);
//        RealVlaue realVlaue = (RealVlaue) map.get(key);
        if (realVlaue.getExpre() + realVlaue.getTime() > System.currentTimeMillis()) {
            return null;
        }

        return realVlaue.getValue();
    }

    @Data
    class RealVlaue {
        public RealVlaue(Object value, Long time, Long expre) {
            this.value = value;
            this.time = time;
            this.expre = expre;
        }

        Object value;
        Long time;
        Long expre;
    }
}
