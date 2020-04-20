package com.example.springgeek.lambda;

import org.apache.commons.collections.MapUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: wgl
 * @Date: 2020/03/13 14:21
 * @Description:
 */
public class OneLamdba {
    public static void main(String[] args) {
        /*for (int i =0;i<5;i++){
            Map<String,Object> map = new HashMap<>();
            map.put("fileKey",i+"a");
            list.add(map);
        }
        String value =  list.stream().map(m -> (String)m.get("fileKey")).collect(Collectors.joining(","));
        System.out.println(value);*/
        //test1();
        //maxOrMinCase();
        //ountCase();
        reduceCase();
    }
    public static void test(){
        List<Map<String,Object>> list = new ArrayList<>();
        for (int i =0;i<2;i++){
            Map<String,Object> map = new HashMap<>();
            map.put("status",1);
            list.add(map);
        }
        for (int i =0;i<2;i++){
            Map<String,Object> map = new HashMap<>();
            map.put("status",2);
            list.add(map);
        }
        list.forEach(map -> {
            if (MapUtils.getIntValue(map, "status") == 2){
                map.put("status",1);
            }else {
                map.put("status",0);
            }
        });
        System.out.println(list.toString());
    }
    public static void test1(){
        List<Map<String,Integer>> list = getList();
        List<Map<String, Integer>> id = list.stream().filter(stringIntegerMap -> stringIntegerMap.get("id") > 2).collect(Collectors.toList());
        System.out.println(id);
    }
    public static void maxOrMinCase(){
        List<Map<String,Integer>> list = getList();
        Optional<Map<String, Integer>> maxId = list.stream().max(Comparator.comparing(m -> m.get("id")));
        Optional<Map<String, Integer>> minId = list.stream().min(Comparator.comparing(m -> m.get("id")));
        if (maxId.isPresent()){
            System.out.println(maxId.get());
        }
        if (minId.isPresent()){
            System.out.println(minId.get());
        }
    }
    public static void countCase(){
        List<Map<String, Integer>> list = getList();
        long id = list.stream().filter(m -> m.get("id") > 2).count();
        System.out.println(id);
    }
   public static List<Map<String,Integer>> getList(){
        List<Map<String,Integer>> list = new ArrayList<>();
        int a = 0;
        for (int i =0;i<5;i++){
            a++;
            Map<String,Integer> map = new HashMap<>();
            map.put("id",a);
            list.add(map);
        }
        return list;
    }

    public static void reduceCase(){
        Integer reduce = Stream.of(1, 2, 3, 4).reduce(0, (acc, x) -> acc+ x);
        System.out.println(reduce);
    }
}
