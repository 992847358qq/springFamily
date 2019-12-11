package com.example.springgeek;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wgl
 * @Date: 2019/11/26 14:59
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Map<String,Object> return_map = new HashMap();
        String str = "123";
        String str1 = "1234";
        return_map.put("classId",str);
        System.out.println(return_map.toString());
        if (str1!=null &&!str.equals(str1)){
            return_map.put("classId",str1);
            System.out.println(return_map.toString());
        }else {
            System.out.println(return_map.toString());
        }
    }
}
