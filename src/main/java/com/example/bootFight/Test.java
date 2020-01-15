package com.example.bootFight;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


/**
 * @Author: wgl
 * @Date: 2019/12/26 09:45
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> map1 = null;
        map.put("q","q");
        map.put("a","a");
        map.put("z","z");
        System.out.println(map1.get("w"));
        map.put("s",map1.get("w"));
    }
}
