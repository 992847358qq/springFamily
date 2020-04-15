package com.example.springgeek.lambda;

import com.example.springgeek.lambda.bean.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/4/12 22:37
 **/
public class TestCase {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(new Student("路飞",22,175),
                new Student("红发",40,180)).collect(Collectors.toList());
        System.out.println(studentList);
    }
}
