package com.github.hcsp.inheritance;

public class Anmial {
    private String name;

    public String getName() {
        return name;
    }

    public Anmial(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }

}
