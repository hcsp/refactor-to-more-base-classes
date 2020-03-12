package com.github.hcsp.inheritance;


public class Animal<name> {
    private String name;

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
