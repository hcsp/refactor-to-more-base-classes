package com.github.hcsp.inheritance;

public class Human extends Life {
    int age;

    public Human(String name,int age) {
        super(name);
        this.age = age;
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}
