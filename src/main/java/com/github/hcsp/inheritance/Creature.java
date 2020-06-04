package com.github.hcsp.inheritance;

public class Creature {
    private String name;

    public Creature(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
