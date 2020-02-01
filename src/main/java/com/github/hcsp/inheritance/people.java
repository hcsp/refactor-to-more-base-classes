package com.github.hcsp.inheritance;

public class people extends body {
    protected int age;

    public people(String name, int age){
        super(name);
        this.age = age;
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}
