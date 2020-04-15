package com.example.springgeek.lambda.bean;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/4/12 22:31
 **/
public class Student {
    String name;
    int age;
    int stature;
    SpecialityEnum specialityEnum;

    public Student(){

    };
    public Student(String name, int i, int i1) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStature() {
        return stature;
    }

    public void setStature(int stature) {
        this.stature = stature;
    }
}
