package com.github.hcsp.inheritance;

public class Animal {
    protected String name;
    Animal(String name) {
        this.name = name;
    }

    protected void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
