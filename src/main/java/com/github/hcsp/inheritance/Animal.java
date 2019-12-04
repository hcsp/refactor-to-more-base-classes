package com.github.hcsp.inheritance;

public abstract class Animal {
    protected String name;

    protected Animal(String name) {
        this.name = name;
    }

    protected void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
