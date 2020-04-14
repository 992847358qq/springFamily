package com.example.springgeek.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: wgl
 * @Date: 2020/03/13 14:21
 * @Description:
 */
public class OneLamdba {
    public static void main(String[] args) {
        List<Map<String,Object>> list = new ArrayList<>();
        for (int i =0;i<5;i++){
            Map<String,Object> map = new HashMap<>();
            map.put("fileKey",i+"a");
            list.add(map);
        }
        String value =  list.stream().map(m -> (String)m.get("fileKey")).collect(Collectors.joining(","));
        System.out.println(value);
    }
}
