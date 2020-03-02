package com.github.hcsp.inheritance;

public class Mankind extends Animal {
    protected int age;

    public Mankind(String name, int age) {
        super(name);
        this.age = age;
    }

    public Mankind() {
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);

    }
}
