package com.github.hcsp.inheritance;

public class body {
    protected String name;

    public body(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
