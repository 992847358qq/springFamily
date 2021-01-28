package com.example.springgeek.volatile1;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: wgl
 * @Date: 2020/06/28 18:20
 * @Description:
 */
public class Test1 {
    public static void main(String[] args) {
        String str = "wgl";
        List<String> list  = Arrays.asList(new String[]{"wgl","wyy","wxs"});
        String join = StringUtils.join(list, ",");
        System.out.println(join);
    }
}
