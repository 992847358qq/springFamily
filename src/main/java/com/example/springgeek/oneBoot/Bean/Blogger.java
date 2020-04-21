package com.example.springgeek.oneBoot.Bean;

/**
 * @author MR.Wang
 * @dept
 * @description TODO
 * @date 2020/4/19 16:34
 **/
public class Blogger {
    private Long id;
    private String name;
    private String pass;

    public Blogger(Long id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
