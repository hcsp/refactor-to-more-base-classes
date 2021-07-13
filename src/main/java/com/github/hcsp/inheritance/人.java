package com.github.hcsp.inheritance;

public class 人 extends 生物 {
    int age;

    public 人(String name, int age) {
        super(name);
        this.age = age;
    }

    public void sayMyAge() {
        System.out.println("我的年龄是" + age);
    }
}
