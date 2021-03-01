package com.mashibing.dp;


import java.util.HashMap;
import java.util.Map;

/**
 * ce
 *
 * @author FanLinSheng
 * @date 2021/02/26 14:11
 **/
public class FanTest {

    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("fanls", "ssss");


        System.out.println(hash("卡萨个ID股是否会对萨"));
    }

    static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
