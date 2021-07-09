package com.github.hcsp.inheritance;

public class Life {
    private String name;

    public Life(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
