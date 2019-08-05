package com.github.hcsp.inheritance;

public class Base {
    String name;
    public Base(String name){
        this.name = name;
    }
    public void sayMyName() {
        System.out.println("我的名字是" + name);
    }
}
