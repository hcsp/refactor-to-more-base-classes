package com.github.hcsp.inheritance;

public class Creature {
    private String name;

    Creature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + getName());
    }
}
